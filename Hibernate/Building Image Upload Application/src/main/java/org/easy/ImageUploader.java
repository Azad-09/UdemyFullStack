package org.easy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.easy.hibernate.DAO.FilesDAO;
import org.easy.hibernate.entity.Files;

@WebServlet("/imageUpload")
public class ImageUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String path = "/C:/Users/azadm/Downloads/DownImg/";
	
//	POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "fileUpload":
			fileUpload(request, response);
			break;
			
		case "updateInformation":
			updateInformation(request, response);
			break;
			
		default:
			request.getRequestDispatcher("index.jsp");
			break;
		}
	}

//	GET
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {	
		case "listingImages":
			listingImages(request, response);
			break;
			
		case "viewImage":
			viewImage(request, response);
			break;
			
		case "deleteImage":
			deleteImage(request, response);
			break;
			
		default:
			request.getRequestDispatcher("index.jsp");
			break;
		}
	}
	
//BUSSINESS LOGIC
	private void listingImages(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Files> files = new FilesDAO().listFiles();
		request.setAttribute("files", files);
		request.setAttribute("path", path);
		request.getRequestDispatcher("listFiles.jsp").forward(request, response);
	}

	public void fileUpload (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> images = upload.parseRequest(request);
			for(FileItem image: images) {
				String name = image.getName();
//				try {name = name.substring(name.lastIndexOf("\\")+ 1);} catch (Exception e) {e.printStackTrace();} 	
				System.out.println(name);
				File file = new File(path + name);
				if (!file.exists()) {
					new FilesDAO().addFileDetails(new Files(name));
					image.write(new File(path + name));	
				}

						
			}
		} catch (Exception e) {		
			e.printStackTrace();
		}
		listingImages(request, response);
	}
	
	private void updateInformation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fileID = Integer.parseInt(request.getParameter("fileId"));
		String label = (String) request.getParameter("label");
		String caption = (String) request.getParameter("caption");
//		String fileName = request.getParameter("fileName");
//		Files file = new Files(fileID,label, caption);
		new FilesDAO().updateInformation(fileID, label, caption);
		listingImages(request, response);
		
	}
	
	private void viewImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fileId = Integer.parseInt(request.getParameter("fileId"));
		Files file =  new FilesDAO().getFile(fileId);
		request.setAttribute("file", file);
		request.setAttribute("path", path);
		request.getRequestDispatcher("viewImage.jsp").forward(request, response);
		System.out.println(file);
	}
	
	private void deleteImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		FILE DELETION FROM DATABASE
		int fileId = Integer.parseInt(request.getParameter("fileId"));
		Files file = new FilesDAO().getFile(fileId);
		new FilesDAO().deleteFiles(fileId);
		
//		FILE DELETION FROM DISK
		File fileOnDisk = new File(path+ file.getFileName());
		if(fileOnDisk.delete()) {
			System.out.println("File deleted from disk");
		}else {
			System.out.println("File is not deleted from disk");
		}
		
		listingImages(request, response);
	}
	
}

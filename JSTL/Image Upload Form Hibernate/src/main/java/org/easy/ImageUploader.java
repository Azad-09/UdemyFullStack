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
	public String path = "C:/Users/azadm/Downloads/DownImg/";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	}
	
}

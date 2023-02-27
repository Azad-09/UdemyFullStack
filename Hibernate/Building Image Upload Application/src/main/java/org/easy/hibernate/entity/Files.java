package org.easy.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "file")
@Table(name = "files")
public class Files {
	@Id
	@Column(name = "file_id")
	private int file_id;
	
	@Column(name = "file_name")
	private String fileName;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "caption")
	private String caption;
	
	//Constructor
	public Files() {
	
	}
	
	public Files(String fileName) {
		this.fileName = fileName;
	}

	public Files(String fileName, String label, String caption) {
		this.fileName = fileName;
		this.label = label;
		this.caption = caption;
	}
	
	

	public Files(int file_id, String label, String caption) {
		this.file_id = file_id;
		this.label = label;
		this.caption = caption;
	}
	
	

	public Files(int file_id, String fileName, String label, String caption) {
		this.file_id = file_id;
		this.fileName = fileName;
		this.label = label;
		this.caption = caption;
	}

	//Getter Setter
	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	@Override
	public String toString() {
		return "File ID: " + file_id + " Name: " + fileName + " Label: " + label + " Caption: " + caption;
	}

}

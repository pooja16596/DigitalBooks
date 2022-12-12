package com.bezkoder.springjwt.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BookCreaPayload {
	
	@NotBlank
	@Size(max = 150)
	private String title;
	
//	@NotBlank
//	@UniqueElements
//	@Size(min=4 ,max=7)
	private int code;
	
	@NotBlank
	@Size(max = 100)
	private String category;

//	@NotBlank
//	@Size(max = 50)
	private double price;
	
	@NotBlank
	@Size(max = 120)
	private String publisher;

	boolean isActive;
	
	private String bookcontent;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getBookcontent() {
		return bookcontent;
	}

	public void setBookcontent(String bookcontent) {
		this.bookcontent = bookcontent;
	}

	@Override
	public String toString() {
		return "BookCreaPayload [title=" + title + ", code=" + code + ", category=" + category + ", price=" + price
				+ ", publisher=" + publisher + ", isActive=" + isActive + ", bookcontent=" + bookcontent + "]";
	}

	
	
	
}

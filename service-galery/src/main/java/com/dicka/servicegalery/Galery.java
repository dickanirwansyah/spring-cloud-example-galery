package com.dicka.servicegalery;

import java.util.ArrayList;
import java.util.List;

public class Galery {

	private int id;
	private String title;
	private String image;

	public Galery(){}
	
	public Galery(String title, String image){
		this.title = title;
		this.image = image;
	}
	
	public Galery(int id, String title, String image){
		this.id = id;
		this.title = title;
		this.image = image;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getImage(){
		return image;
	}
}

package com.hiber.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificates {
	private String course;
	private String duration;
	
	
	
	//Getter& Setter method,all-args constructors,no-args constructors,toString method
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Certificates(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificates [course=" + course + ", duration=" + duration + "]";
	}
	
	

}

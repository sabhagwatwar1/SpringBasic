package com.spring.constructor.injection;

public class Certi {
	private String lecture;

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public Certi(String lecture) {
		super();
		this.lecture = lecture;
	}

	public Certi() {
		super();
	}

	@Override
	public String toString() {
		return "Certi [lecture=" + lecture + "]";
	}
	
}

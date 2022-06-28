package com.spring.reference;

public class A {
	private int x;
	private B oj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOj() {
		return oj;
	}
	public void setOj(B oj) {
		this.oj = oj;
	}
	public A(int x, B oj) {
		super();
		this.x = x;
		this.oj = oj;
	}
	public A() {
		super();
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", oj=" + oj + "]";
	}
	
}

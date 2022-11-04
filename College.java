package com.bnt.demo.stu;

public class College {

	private String collegeName;
	private String address;
	private double merit;
	public College(String collegeName, String address, double merit) {
		super();
		this.collegeName = collegeName;
		this.address = address;
		this.merit = merit;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMerit() {
		return merit;
	}
	public void setMerit(double merit) {
		this.merit = merit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("College [collegeName=");
		builder.append(collegeName);
		builder.append(", address=");
		builder.append(address);
		builder.append(", merit=");
		builder.append(merit);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

package com.struts.model;

public class Student {
	
	private String name;
	private String city;
	private int age;
	private double stipent;
	private String course;
	private String email;
	private String gender;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getStipent() {
		return stipent;
	}
	public void setStipent(double stipent) {
		this.stipent = stipent;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + ", stipent=" + stipent + ", course="
				+ course + ", email=" + email + ", gender=" + gender + ", hobby=" + hobby + "]";
	}
	
	

}

package com.struts.action;

import java.util.Arrays;
import java.util.List;

import com.struts.model.Student;

public class StudentAction {
	
	private Student student;
	
	private List<String> hobbies;
	
	public StudentAction() {
		hobbies = Arrays.asList("sports","music","dance");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports","music","dance");
	}
	
	//this will be 
	public String showsStudForm() {
		return "none";
	}
	
	public String execute() {
		if(student.getName().equals("Allwin")) {
			return "success";
		}
			return "error";
		}
	}

	


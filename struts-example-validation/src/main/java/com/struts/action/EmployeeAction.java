package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

@ResultPath(value = "/WEB-INF/content/")
@Namespace("/")
public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Action(value = "empregister", results = { @Result(name = "success", location = "empsuccess.jsp"),
			@Result(name = "input", location = "empform.jsp") })

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (employee.getEmployeeName().equals("Allwin"))
			return SUCCESS;
		return INPUT;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
		if(employee.getEmployeeName().length()<=0)
			addFieldError("employee.EmployeeName", "Name is required");
		if(employee.getAge()<20 || employee.getAge()>70)
			addFieldError("employee.age", "Age should be between 21 and 70");
		if(employee.getCity().length()<=0)
			addFieldError("employee.city", "City is required");
		if(employee.getSalary()<=0)
			addFieldError("employee.salary", "Salary should be greater than zero");
		if(employee.getEmail().length()<=0)
			addFieldError("employee.email", "Email is not valid");
		super.validate();
	}
	
	

}

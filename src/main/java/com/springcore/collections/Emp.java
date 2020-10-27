package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String empName;
	private List<String> phoneNo;
	private Set<String> addresses;
	private Map<String, String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phoneNo=" + phoneNo + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}


	
	

}

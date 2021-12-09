package entity;

import java.sql.Date;
import java.util.Set;

public class Employee {
	
	private Long emId;
	private String firstName;
	private String lastName;
	private Date birthday;
	private Address address;
	private Set<Project> projects;
	
	public Employee() {
		
	}
	

	public Long getEmId() {
		return emId;
	}


	public void setEmId(Long emId) {
		this.emId = emId;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return emId+" "+firstName+" "+lastName+" "+birthday+" "+address+" "+projects;
	}
	
	
	
	
}

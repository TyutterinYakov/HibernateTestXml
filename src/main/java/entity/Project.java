package entity;

import java.util.Set;

public class Project {
	
	private Long prId;
	private String title;
	private Set<Employee> employees;
	
	public Project() {
		
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return prId+" "+title;
	}


	public Long getPrId() {
		return prId;
	}


	public void setPrId(Long prId) {
		this.prId = prId;
	}
	
}

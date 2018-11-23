package com.cg.mydemo.bean;

public class Employee implements MyInterface{

	private int empId;
	private String empName;
	
	public Employee()
	{
		empId=100;
		empName="ABCD";
		
	}
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	@Override
	public String toString() {
		return "Employee ID is: " + empId + "\nEmployee Name is: " + empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (this.empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

}

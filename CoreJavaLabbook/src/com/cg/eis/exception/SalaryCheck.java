package com.cg.eis.exception;

public class SalaryCheck {
	
	public void salaryCheck(int salary) throws EmployeeException
	{
		if(salary<3000)
		{
			throw new EmployeeException("employee not eligible");
		}
		else
		{
			System.out.println("employee eligible");
		}
	}

}

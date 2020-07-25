package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	SalaryCheck obj=new SalaryCheck();
	System.out.println("enter salary of employee");
	int salary=sc.nextInt();
	try {
		obj.salaryCheck(salary);
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

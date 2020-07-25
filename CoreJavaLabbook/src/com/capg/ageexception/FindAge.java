package com.capg.ageexception;

import java.util.Scanner;

public class FindAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>15)
		{
			System.out.println("person is elegible");
		}
		else
		{
			throw new AgeException("error person is not elgible ");
		}
	}
}

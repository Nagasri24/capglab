package com.capg.nameexception;

import java.util.Scanner;

public class Details {

	public static void main(String[] args){
		//Scanner sc=new Scanner(System.in);
		Namefinder n= new Namefinder();
		String firstName="";
		String lastName="";
		try {
			String fullName= n.FullName(firstName, lastName);
			System.out.println(fullName);
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

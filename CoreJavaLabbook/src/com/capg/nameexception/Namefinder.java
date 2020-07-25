package com.capg.nameexception;

public class Namefinder {

	public String FullName(String first, String last) throws NameException
	{
		if(first.isBlank()||last.isBlank())
	{
		throw new NameException("name is blank");
	}
		else
		{
			return first+last;

		}
		
	}
}

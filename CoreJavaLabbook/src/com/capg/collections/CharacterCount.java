package com.capg.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterCount {

	public Map<Character, Integer> countCharacter(char[] characters)
	{
		int count=0;
		Map<Character, Integer> noOfChars=new HashMap<Character, Integer>();
		for (int i = 0; i < characters.length; i++) {
			for (int j = 0; j < characters.length; j++) {
			
				if(characters[i]==characters[j])
				{
					count++;
				}
			}
			
			noOfChars.put(characters[i], count);
			
		}
		return noOfChars;
		
	}
	public static void main(String[] args) {
		CharacterCount obj=new CharacterCount();
		char[] characters= {'a','p','p','l','e'};
	Map<Character, Integer> noOfCharacters=	obj.countCharacter(characters);
	
	  
 } 
	}


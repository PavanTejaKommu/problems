package com.problemsolving;

public class ProgramP {
	  public boolean detectCapitalUse(String word) {
	        
	        for(int i=0;i< word.length();i++){
	            char ch = word.charAt(i);
	            if(Character.isLowerCase(ch)){
	                 return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		ProgramP p = new ProgramP();
		
	System.out.println(p.detectCapitalUse("g"));

	}

}

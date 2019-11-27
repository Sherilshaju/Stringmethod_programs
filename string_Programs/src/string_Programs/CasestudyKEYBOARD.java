package string_Programs;

import java.util.Scanner;

public class CasestudyKEYBOARD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String str1="qwertyuiop asdfghjkl; zxcvbnm,./";
    System.out.println("Enter a character");
    char c=s.next().charAt(0);
    System.out.println("Enter the String");
    String str2=s.next();
    int i,j;
    char ch1,ch2;
    for(i=0;i<str2.length();i++)
    {
    	//ch1=str1.charAt(i);
    	 for(j=0;j<str1.length();j++)
    	    {
    	   // ch2=str2.charAt(j);
    	    if(str2.charAt(i)==str1.charAt(j)&&c=='R')
    	    {
    	    	
    	    System.out.printf("%c",str1.charAt(j-1));	
    	    }
    	    if(str2.charAt(i)==str1.charAt(j)&&c=='L')
    	    {
    	    	
    	    	System.out.printf("%c",str1.charAt(j+1));	
    	    }
    	    }
    	    
    }
    
    
    
   
    
	}

}

package string_Programs;

import java.util.Scanner;

public class Splitandrevstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j;
		
	    System.out.println("Enter a Sentence");
	    String string1=s.nextLine();
	   // int length1=string1.length();
	    String split[]=string1.split(" ");//to split the sentence
	    for(i=0;i<split.length;i++)
	    {
	    	if(i%2!=0)
	    	{
	    	int l=split[i].length();//length of the word which is in even position	
	    	for(j=l-1;j>=0;j--)//for loop to take each character in a word in reverse order
	    	{
	    		System.out.print(split[i].charAt(j));
	    	}
	    	System.out.print(" ");
	    	}
	    	else
	    	{
	    		System.out.print(split[i]+" ");
	    	}
	    }
	}

}

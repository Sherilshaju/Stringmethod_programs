package string_Programs;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,t=0;
		int l=0;
		System.out.println("Enter a Sentence");
		String s1=s.nextLine();
		String words[]=s1.split(" ");
		for(i=0;i<words.length;i++)
		{
			//System.out.println(words[i]);
			 l=words[i].length();
			
			if(l>t)
			{
				t=l;
				
			}
			
			
		}
		for(i=0;i<words.length;i++)
		
		if(t==words[i].length())
		{
			System.out.println("Longest word is:"+words[i]);
		}
		
		System.out.println("number of characters in the longest word is : "+t);
		
		
		
		
	}

}

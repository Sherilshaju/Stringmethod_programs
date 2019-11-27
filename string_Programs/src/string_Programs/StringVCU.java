package string_Programs;

import java.util.Scanner;

public class StringVCU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the first string");
		String s1=s.next();
	System.out.println("Enter the Second string");
		String s2=s.next();
		
		System.out.println("Enter the Third string");
		String s3=s.next();
		char c1;
		char s1c[]=s1.toCharArray();
		
		for(i=0;i<s1c.length;i++)
		{
		 c1=s1.charAt(i);
		if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
		{
			//String vr=s1.replace(c1, '$');
			s1c[i]='$';
			
		}
		}
		for(i=0;i<s1c.length;i++)
		{
			System.out.printf("%c", s1c[i]);
		}
		char c2;
		char s2c[]=s2.toCharArray();
		for(i=0;i<s2c.length;i++)
		{
		 c2=s2.charAt(i);
		if(c2!='A'&&c2!='E'&&c2!='I'&&c2!='O'&&c2!='U'&&c2!='a'&&c2!='e'&&c2!='i'&&c2!='o'&&c2!='u')
		{
			s2c[i]='#';
			
		}
		
		}
		for(i=0;i<s2c.length;i++)
		{
			System.out.printf("%c", s2c[i]);
		}
		String s4=s3.toUpperCase();
		//String s5=vr.concat(cr);
		//String concat=s5.concat(s4);
		System.out.println(s4);
	}

}

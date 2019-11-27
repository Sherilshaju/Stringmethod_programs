package string_Programs;

import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		int i=1;
		String x;
		do
		{
		System.out.println("Registration");
		System.out.println("Enter Your name");
		s.append("NAME : "+sc.next()+"\n");
		System.out.println("Enter the Address");
		s.append("ADDRESS : "+sc.next()+"\n");
		System.out.println("Enter the Contact number");
		s.append("CONTACT NUMBER : "+sc.next()+"\n");
		System.out.println("Enter the E-mail ID");
		s.append("E-Mail ID : "+sc.next()+"\n");
		System.out.println("Enter the Proof Type");
		s.append("PROOF TYPE : "+sc.next()+"\n");
		System.out.println("Enter the Proof ID");
		s.append("PROOF ID : "+sc.next()+"\n");
		System.out.printf("Thank you for registering. Your id is %d ",i);
		i++;
		System.out.println();
		System.out.println(s);
		System.out.println("Do you want to continue Registration(y/n)?");
		 x=sc.next();
		}while(x.equals("y"));
		
	}

}

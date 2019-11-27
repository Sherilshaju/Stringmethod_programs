package string_Programs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employeedetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first name");
		StringBuffer name=new StringBuffer(br.readLine());
		System.out.println("Enter your last name");
		StringBuffer lastname=new StringBuffer(br.readLine());
		name.append(lastname);
		System.out.println("Enter your age");
		StringBuffer age=new StringBuffer(br.readLine());
		System.out.println("Enter your gender");
		StringBuffer gender=new StringBuffer(br.readLine());
		System.out.println("Enter your employee id");
		StringBuffer id=new StringBuffer(br.readLine());
		System.out.println("Enter your salary details");
		StringBuffer salary=new StringBuffer(br.readLine());
		System.out.println("Enter your address");
		StringBuffer address=new StringBuffer(br.readLine());
		System.out.println("NAME : "+name);
		System.out.println("GENDER : "+gender);
		System.out.println("AGE : "+age);
		System.out.println("ID : "+id);
		System.out.println("SALARY : "+salary);
		System.out.println("ADDRESS : "+address);
		
	}

}




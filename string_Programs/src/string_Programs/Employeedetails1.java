package string_Programs;
import java.util.Scanner;
public class Employeedetails1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the name");
		s.append("Name : "+sc.next()+"\n");
		System.out.println("Enter the ID");
		s.append("ID : "+sc.next()+"\n");
		System.out.println("Enter the Address");
		s.append("ADDRESS : "+sc.next()+"\n");
		System.out.println("Enter the number");
		s.append("NUMBER : "+sc.next()+"\n");
		System.out.println(s);
		

	}

}

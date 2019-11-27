package string_Programs;
import java.util.Scanner;
public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    StringBuffer s=new StringBuffer();
   System.out.println("1.Car\n2.Bike");
   int n=sc.nextInt();
   Car obj1=new Car();
   Bike obj2=new Bike();
   if(n==1)
   {
	   System.out.println("Enter the details of thr car");
	   System.out.println("Enter the Colour");
	   s.append("COLOUR : "+sc.next()+"\n");
	   System.out.println("Enter the maximum speed");
	   s.append("MAXIMUM SPEED : "+sc.next()+"\n");
	   System.out.println("Enter the number of seats");
	   s.append("NUMBER OF SEATS : "+sc.next()+"\n");
	   System.out.println("Enter the number of wheels");
	   s.append("NUMBER OF WHEELS  : "+sc.next()+"\n");
	   System.out.println("Enter the number of doors");
	   s.append("NUMBER OF DOORS : "+sc.next()+"\n");
	   System.out.println("Enter the Status of AC(true/false)");
	   s.append("AC : "+sc.next()+"\n");
	   obj1.display(s);
   }
   else if(n==2)
   {
	   System.out.println("Enter the details of thr Bike");
	   System.out.println("Enter the Colour");
	   s.append("COLOUR : "+sc.next()+"\n");
	   System.out.println("Enter the maximum speed");
	   s.append("MAXIMUM SPEED : "+sc.next()+"\n");
	   System.out.println("Enter the number of seats");
	   s.append("NUMBER OF SEATS : "+sc.next()+"\n");
	   System.out.println("Enter the number of wheels");
	   s.append("NUMBER OF WHEELS  : "+sc.next()+"\n");
	   System.out.println("Enter the Status of Disk Break(true/false)");
	   s.append("Disk Break : "+sc.next()+"\n"); 
	   obj2.display(s);
   }
   else
	   System.out.println("Invalid Input");
	}

}
class Vehicle{
	
	
	
}
class Car extends Vehicle{

	public void display(StringBuffer s) {
		// TODO Auto-generated method stub
	System.out.println("\nCar Details : ")	;
	System.out.println(s);
	}
	
}



class Bike extends Vehicle{

	public void display(StringBuffer s) {
		// TODO Auto-generated method stub
		System.out.println("\nBike Details : ")	;
		System.out.println(s);	
	}
	
	
}
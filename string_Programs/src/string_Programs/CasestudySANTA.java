package string_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class CasestudySANTA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int len=0;
    //String sort[]=new String[50];
    System.out.println("Enter the Guest Name");
    String guest_name=s.next();
    System.out.println("Enter the Host Name");
    String host_name=s.next();
    System.out.println("Enter the pile of String");
    String pile=s.next();
    String con=guest_name.concat(host_name);

    char temp[]=con.toCharArray();
    int l1=temp.length;
    Arrays.sort(temp);
   // System.out.println(temp);
    char temp1[]=pile.toCharArray();
    int l2=temp1.length;
    Arrays.sort(temp1);
    String a=new String(temp);
    String a1=new String(temp1);

    if(a.equals(a1))
    {
    System.out.println("Yes");
    }
    else
    {
    	System.out.println("No");
    }
    
    
	}

}

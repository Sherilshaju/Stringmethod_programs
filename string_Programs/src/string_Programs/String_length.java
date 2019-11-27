package string_Programs;

import java.util.Scanner;

public class String_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 3 Strings");
    String string1=s.nextLine();
    String string2=s.nextLine();
    String string3=s.nextLine();
    int length1=string1.length();
    int length2=string2.length();
    int length3=string3.length();
    System.out.println("Length of the first string is "+length1);//to find the length
    System.out.println("Length of the Second string is "+length2);
    System.out.println("Length of the Third string is "+length3);
    char c=string1.charAt(4);//to find the character at given position
    System.out.println("character at postition 4 of first string is "+c);
    System.out.println("Enter the range to find the substring");
    int range1=s.nextInt();
    int range2=s.nextInt();
    String substr=string2.substring(range1,range2);//to find the substring within the given range
    System.out.println("substring : "+substr);
    boolean startw=string1.startsWith("hi");//to check whether the string starts with the given string
    System.out.println("String1 Starts with hi? : "+startw);
    //System.out.println("Enter the string to find the index");
    String strindex=s.nextLine();
    int index=string1.indexOf("name");//to find the index of the string
    System.out.println("index of name is : "+index);
    String concat=string1.concat( string2);//concatenation
    System.out.println("concatenated string is "+concat);
    //String strreplace=
    System.out.println("replacing in string3 : "+string3.replace("a", "A"));//replacing a character
	String sp[]=string1.split(" ");//splitting the string
	for(int i=0;i<sp.length;i++)
	{
		 System.out.println("Splitting string 1"+sp[i]);	
	}
	
	}

}

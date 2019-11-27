package string_Programs;
import java.util.Scanner;
public class Pashacasestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the pasha's String");
    String str=s.next();
    System.out.println("Enter the number of days");
    int n1=s.nextInt();
    System.out.println("Enter the position from which Pasha started transforming");
    int n2=s.nextInt();
    System.out.println("The resultant string");
    int len=str.length();
    int i;
    String rev=" ";
    int a=(len-n2)+1;
    char temp[]=str.toCharArray();
    int len1=temp.length;
for(i=1;i<=len1;i++)
{
	char c=str.charAt(i);
	//rev=rev+i;
}
//System.out.println(rev);
for(i=a;i>=n2;i--)
{
	rev=rev+temp[i];
}
System.out.println(rev);

	}

}

package string_Programs;
import java.util.Scanner;
public class Robberycasestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int i,j=0,max=0,sum=0;
    System.out.println("Enter the array elements");
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
    	a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
    	if(a[i]>max)
    	{
    		max=a[i];
    		sum=sum+max;
    		j=i;
    	}
    }
    for(i=0;i<n;i++)
    {
    	if(i!=j&&i!=j+1)
    	{
    		if(a[i]>max)
        	{
        		max=a[i];
        		sum=sum+max;
        		j=i;
        	}
    	}
    }
    System.out.println(sum);
    
	}

}

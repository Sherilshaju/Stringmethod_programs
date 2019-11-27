package string_Programs;

import java.util.Scanner;

public class Stringcountall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
		System.out.println("Enter a Sentence");
		String string1=s.nextLine();
		int length=string1.length();
		    //String words[]=string1.split(" ");//to split the sentence
		    for(i=0;i<length;i++)
		    {
		    	char c=string1.charAt(i);
		    	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		    		{
		    		c1++;
		    	}
		    	else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='.'||c==','||c=='/'||c==';'||c=='?'||c=='{'||c=='}'||c==':')
		    	{
		    		c2++;
		    	}
		    	else if(c==' ')
		    	{
		    	c3++;	
		    	}
		    	else if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
		    	{
		    		c4++;
		    	}
		    	if(c>=65&&c<97)
				{
					c5++;
				}
				else if(c>=97&&c<=122)
				{
					c6++;
				}
		    	if(c>='a'&&c<='z'||c>='A'&&c<='Z')
		    	{
		    		c7++;
		    	}
		    }
		    System.out.println("vowel count:"+c1);
		    System.out.println("Special character count:"+c2);
		    System.out.println("Space count:"+c3);
		  System.out.println("Number count:"+c4);
		    System.out.println("Uppercase count:"+c5);
		    System.out.println("Lowercase count:"+c6);
		    System.out.println(" character count:"+c7);

}
}


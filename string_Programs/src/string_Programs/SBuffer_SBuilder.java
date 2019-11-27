package string_Programs;

public class SBuffer_SBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String buffer
		StringBuffer s=new StringBuffer("hello");
		s.append("face");
		System.out.println(s);
		//String Builder
		StringBuilder b=new StringBuilder("hello");
		b.append("face");
		System.out.println(b);
	}

}

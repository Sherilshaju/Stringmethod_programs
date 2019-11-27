package string_Programs;

public class Insert_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insert method
		StringBuffer s=new StringBuffer("hello");
		s.insert(5, "hi");
		System.out.println(s);
		//replace method
		StringBuffer b=new StringBuffer("welcome");
		b.replace(2,4,"wel");
		System.out.println(b);
		b.delete(0,2);
		System.out.println(b);
		b.append("face");
		System.out.println(b);
		b.deleteCharAt(4);
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		
	}

}

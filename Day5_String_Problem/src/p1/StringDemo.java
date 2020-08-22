package p1;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "hello how are you";
		
		s.toUpperCase();
		System.out.println(" s :- "+s);
		
		s = s.toUpperCase();
		System.out.println("new s "+s);
		
		//---------------------------
		
		   //012345678910
		s = "abcdefghijk";
		s = s.substring(3,8);
		
	}//end main
}

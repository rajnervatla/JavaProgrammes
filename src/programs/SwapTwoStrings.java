package programs;

public class SwapTwoStrings {
	public static void main(String[] args) 
	{
	// Create two string literals.	
	  String s1 = "Love";
	  String s2 = "You";
	  System.out.println("Before swapping, s1 = " +s1+ ", s2 = "+s2 );

	// Swapping two strings using third variable temp. 
	   String temp = s1;
	   s1 = s2;
	   s2 = temp;
	   System.out.println("After swapping, s1 = " +s1+ ", s2 = "+s2 );
	  }

}

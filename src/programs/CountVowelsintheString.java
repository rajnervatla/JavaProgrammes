package programs;

public class CountVowelsintheString {
	
	public static void main(String[] args) {
		
		String str="Welcome to the management";
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||
			   str.charAt(i)=='e'||
			   str.charAt(i)=='i'||
			   str.charAt(i)=='o'||
			   str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Number of Vowels"+count);
	}

}

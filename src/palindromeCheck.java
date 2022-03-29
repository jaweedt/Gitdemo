import java.util.Scanner;

public class palindromeCheck {

	
	public static boolean ifPalindrome(String s)
	{
		

	
	 int i=0;
	 int j=s.length()-1;
	 
	 
	 while(i<j)
	 {
		if(s.charAt(i) != s.charAt(j))
		{
			return false;
		}
		
		
i++;
j--;


		 
	 }
	return true;
		
	 
		
		
		
	}
	
	
	
	
	
	
	
	
public static void main(String[] args)	
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter string: ");
	String str =  sc.next();
	str = str.toLowerCase();
	if(ifPalindrome(str))
	{
		System.out.println("It is a palindrome");
	}
	else
	System.out.println("It is not a Palindrome");
	sc.close();
	

}
}


public class StringPalindrome
{
	public static void main(String[] args)
	{
	  String S1="Level";
	  String S="";
	  for(int i=S1.length()-1; i>=0; i--)
	  {
		  S=S+S1.charAt(i);
	  }
	  System.out.println("Reverse Of a String is : "+S);
	  if(S1.equalsIgnoreCase(S))
	  {
		  System.out.println("It's a palindrome string");
	  }
	  else
	  {
		  System.out.println("It's Non-palindrome string");
	  }
	}

}

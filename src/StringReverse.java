
public class StringReverse
{
	public static void main(String[] args)
	{
		String S1="gnireenigne tpecxe gnihtyna od nac sreenigne";
		String S="";
		for(int i=S1.length()-1; i>=0; i--)
		{
			S=S+S1 .charAt(i);
		}
		System.out.println("Reverse Of A String is: "+S);
	}

}

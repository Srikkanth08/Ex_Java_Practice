package Java_Practice;

import java.util.Scanner;

public class LargestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the 1st Number");
		int a = sc.nextInt();
		
		System.out.println("Give the 2nd Number");
		int b = sc.nextInt();
		
		System.out.println("Give the 3rd Number");
		int c = sc.nextInt();
		
		System.out.println("Give the 4th Number");
		int d = sc.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a+"is a Largest Number");
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println(b+"is a Largest Number");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println(c+"is a Largest Number");
		}
		else
		{
			System.out.println(d+"is a Largest Number");
		}    
		
		
	}
}

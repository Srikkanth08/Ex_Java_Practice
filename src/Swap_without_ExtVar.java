
public class Swap_without_ExtVar 
{
	public static void main(String[] args) 
	{
	/*	int a=10,b=20;
		a=a+b;   //a=10+20-----a=30
		b=a-b;   //b=30-20-----b=10
		a=a-b;   //a=30-10-----a=20
		System.out.println("a="+a+"  b="+b); */
		
	/*	int a=35,b=15;
		a=a*b;  //35*15=525
		b=a/b;  //525/15=35
		a=a/b;  //525/35=15
		System.out.println(a+" "+b); */
		
		int a=15,b=35,c;
//		c= (a=b);
		b= (a+b)-(a=b);
		System.out.println(a+" "+b);
	}
}

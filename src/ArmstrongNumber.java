
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=371,rem,arm=0,cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+(rem*rem*rem);
		}
		System.out.println("Reverse Of a Number is: "+arm);
		if(cp==arm)
		{
			System.out.println(cp+" Is An Armstrong Number");
		}
		else
		{
			System.out.println(cp+" Is Not An Armstrong Number");
		}
	}
}

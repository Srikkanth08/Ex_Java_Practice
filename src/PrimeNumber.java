
public class PrimeNumber
{
	public static void main(String[] args) 
	{
		int num=7,count=0;  //assume conunt=0
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				count++;  //count=count+1
			}
		}
		if(count==2)
		{
			System.out.println(num+" Is a Prime Number");
		}
		else
		{
			System.out.println(num+" Is Not a Prime Number");
		}
	}
}

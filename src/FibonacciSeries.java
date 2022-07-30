
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int f=0,f1=1,f2;
		System.out.print(f+" ");
		System.out.print(f1+" ");
		for(int i=1;i<=6;i++)     //except 0 & 1 we are adding 6 Numbers
		{
			f2=f+f1;
			System.out.print(f2+" ");
			f=f1;
			f1=f2;
		}
	}
}

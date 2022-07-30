
public class ArrayHighestNumber
{
	//creating User define method with array as args
	public static void max(int arr[]) 
	{
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
			max = arr [i];
			}
		}
		System.out.println("Maximum Number is: " +max);
	}
		public static void main (String args[])
		{
			int a[] = {116,250,700,1000,550};
			max(a);
		}
}

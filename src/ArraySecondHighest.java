
public class ArraySecondHighest 
{
	//Creating User Define Method with array as args
	public static void Sec_Max (int arr [])  
	{
		int max = arr[0],secmax=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				secmax = max;
				max = arr[i];
			}
			else if(arr[i]>secmax)
			{
				secmax=arr[i];
			}
		}
		System.out.println("Maximum Number is: "+max);
		System.out.println("Second Maximum Number is: "+secmax);
	}
	public static void main(String[] args) 
	{
		int a[]= {116,250,700,1000,550};
		Sec_Max(a);
	}
}


public class ArraySecondLowest 
{
	//Creating User Define Method with array as args
	public static void Sec_Min (int arr [])  
	{
		int min = arr[0],secmin=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				secmin = min;
				min = arr[i];
			}
			else if(arr[i]<secmin)
			{
				secmin=arr[i];
			}
		}
		System.out.println("Minimum Number is: "+min);
		System.out.println("Second Minimum Number is: "+secmin);
	}
	public static void main(String[] args) 
	{
		int a[]= {250,700,1000,550,116};
		Sec_Min(a);
	}
}

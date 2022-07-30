class Natural
{
  public static void main(String args[])
  {
    int i;
    for(i=1;i<=100;i++)
    {
      if(i%10==2 || i/10==2)
      {
       System.out.print(i+" ");
      }
    }
  }
}

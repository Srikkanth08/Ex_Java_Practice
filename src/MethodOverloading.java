
public class MethodOverloading 
{
	public static void Payment(String WalletType, String UID)
	{
		System.out.println("Wallet Type is:"+WalletType+"   UID is:"+UID);
	}
	public static void Payment(String CardType, long CardNo, int CVVNo)
	{
		System.out.println("CardType is:"+CardType+"   CardNo is:"+CardNo+"   CVVNo is:"+CVVNo);
	}
	public static void Payment(String AccType, long AcNo, int UserNo, String Pwd)
	{
		System.out.println("AccType is:"+AccType+"   AcNo is:"+AcNo+"   UserNo is:"+UserNo+"   Pwd is:"+Pwd);
	}
	public static void main(String[] args) 
	{
		Payment("Gpay","Gpay234@ybl.com");
		Payment("Debitcard",45816432789L,420);
		Payment("savings",35486785214L,6547523,"ABC123");
	}
}

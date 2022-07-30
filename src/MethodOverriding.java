class Parents
{ 
	public void car()//Overridden method 
	{
		System.out.println("Blue color"); 
	} 
    public void carname() 
    { 
    	System.out.println("Swift"); 
    } 
} 
class Son extends Parents 
{ 
	public void car()//Overriding method 
	{ 
		System.out.println("Black color"); 
	} 
	public void carname() 
    { 
    	System.out.println("BMW"); 
    } 
} 
class Daughter extends Parents 
{ 
	public void car() 
	{ 
		System.out.println("White color"); 
	} 
	public void carname() 
	{ 
		System.out.println("AUDI"); 
	} 
} 
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		Son S = new Son();
		S.car();
		S.carname();
		Daughter D = new Daughter();
		D.car();
		D.carname();
	}
}
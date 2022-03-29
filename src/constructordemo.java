
public class constructordemo {

	public constructordemo()
	{
		System.out.println("This is a constructor");
	}
	
	public constructordemo(int a)
	{
		System.out.println("This is a "+a+" constructor");
	}
	
	public void trial()
	{
		System.out.println("Trail method");
	}
	
	
	
	public static void main(String[] args)
	{
		constructordemo cd = new constructordemo(1);
		cd.trial();
		constructordemo cd1= new constructordemo(2);
		cd1.trial();
		cd.trial();
		
		
	}
}

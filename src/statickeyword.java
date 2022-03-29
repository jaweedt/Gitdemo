
public class statickeyword {

	String name;
	static String location = "Bangalore";
	// int i=0;
	
	
	
	public statickeyword(String name)
	{
		this.name=name;
		
		//i++;
	}
	
	
	public void getDetails()
	{
		System.out.println(name+" "+location);
		//System.out.println(i);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		statickeyword sk = new statickeyword("Jaweed");
		statickeyword sk1= new statickeyword("Juwain");
		
	 sk.getDetails();
	 sk1.getDetails();
	 System.out.println(sk.name);
	 System.out.println(sk1.name);
	;
	 
	 
	}

}

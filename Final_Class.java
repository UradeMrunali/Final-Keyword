//final class created
final class Final_Class{
	void display()
	{
	System.out.println("this is final class");	
	}


//trying to extend final class
//public class FC extends Final_Class {
//	void display()
//	{
//	System.out.println("this is class");	
//	}
	public static void main(String[] args) {
		Final_Class c=new Final_Class();
	    c.display();
	}
}

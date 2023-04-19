

class FM{
	//final method created
	final void show(){
		System.out.println("This is final method");
	}
}

public class  Final_Method extends FM{
// trying to override final method	
//	final void show(){
//		System.out.println("This is final method");
// }
 public static void main(String[] args) {
	FM m= new FM();
	m.show();
}
}



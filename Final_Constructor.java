
public class Final_Constructor {
	//created blank final variable
 final String name;
 final int age;
 
 //initializing value in constructor
 Final_Constructor(){
	 name="Mrunali";
	 age=21;
 }
 
 public static void main(String[] args) {
	 Final_Constructor c = new Final_Constructor();
	System.out.println("Name:"+c.name);
	System.out.println("Age:"+c.age);
}
}

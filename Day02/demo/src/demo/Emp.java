package demo;


class any1{
	int num;
	static int count;
	{count++;}
	static {System.out.println("static block1");}
	any1(){
		System.out.println("Default constructor of any1");
	}
	{System.out.println("non static 1");}
	static Emp n1= new Emp();
	
	static{System.out.println("static block 2");}
	{System.out.println("non static 2");}
	
	public static int getCount() {
		return count;
	}
	
	
}
public class Emp {
	
	public static void main (String args[]) {
		new any1();
		System.out.println(new any1().getCount());
	}
}
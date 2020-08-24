class base{

	/**
	 * 
	 */
	public base() {
		super();
		System.out.println("Default constructor of base");
	}
	
}
class sub1 extends base{

	/**
	 * 
	 */
	public sub1() {
		super();
		System.out.println("Default constructor of sub1");
	}
	
}
class sub2 extends base{

	/**
	 * 
	 */
	public sub2() {
		super();
		System.out.println("Default constructor of sub2");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new base();
		System.out.println("--------------------");
		new sub2();
		System.out.println("----------------------");
		new sub1();
		
	}

}

class base{
	base(){
		System.out.println("Default constructor of base");
	}
}
class sub1 extends base{
	sub1(){
		System.out.println("Default constructor of sub1");
	}
}
class sub2 extends sub1{
	sub2(){
		System.out.println("Default constructor of sub2");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sub2();
		System.out.println("-----------------------");
		new sub1();
		System.out.println("------------------------");
		new base();
	}

}

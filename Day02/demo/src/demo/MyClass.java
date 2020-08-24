package demo;

public class MyClass {
	MyClass(){
		System.out.println("Default no para");
	}
	MyClass(int a){
		System.out.println("PARA 1");
	}
	MyClass(int a, int b){
		System.out.println("para2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClass();
		new MyClass(23);
		new MyClass(42,23);
	}

}

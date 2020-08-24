
public class MyClass {
	static int count;
	int num =22;
	{count++;}
	public static int getCount() {
		return count;
	}
	
	void setNum(int Num) {
		this.num = Num;
	}
	
	int getNum() {
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClass();
		MyClass a1 =  new MyClass();
		a1.setNum(54);
		System.out.println(a1.getNum());
		System.out.println(MyClass.count);
		System.out.println(MyClass.getCount());
	}

}

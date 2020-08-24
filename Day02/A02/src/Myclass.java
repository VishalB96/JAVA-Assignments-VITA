/**
 * 
 */

/**
 * @author Vishal
 *
 */
public class Myclass {
	public int num1 = 0;
	public int num2 = 10;
	public int num3 =30;
	
	
	
	
	public Myclass(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}




	public Myclass(int num1) {
		super();
		this.num1 = num1;
	}




	public Myclass(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}




	public Myclass() {
		super();
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myclass();
		new Myclass(12);
		new Myclass(121,123);
		new Myclass(11,87,44);
	}

}

/**
 * 
 */

/**
 * @author Vishal
 *
 */
public class First {
	protected int F1 = 10;

	/**
	 * 
	 */
	public First() {
		super();
		System.out.println("Default Constructor of First");
	}

	/**
	 * @param f1
	 */
	public First(int f1) {
		super();
		this.F1 = f1;
		System.out.println("Parametrized Constructor of First");
	}

	/**
	 * @return the f1
	 */
	public int getF1() {
		return F1;
	}

	/**
	 * @param f1 the f1 to set
	 */
	public void setF1(int f1) {
		F1 = f1;
	}
	
	
}


public class B {
	protected static int countB;
	private int numB;
	{countB++;}
	B(){
		this.numB=10;
	}
	B(int numB){
		this.numB=numB;
	}
	
	public static int getCountB() {
		return countB;
	}
	
	int getNumB() {
		return numB;
	}
	
	void setNumB(int numB) {
		this.numB=numB;
	}
}

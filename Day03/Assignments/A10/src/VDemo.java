
public class VDemo {
	public static void perform(Vehicle v){
		v.start();
	}
	public static void main(String[] args) {
		
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler("manual"));
	}

}

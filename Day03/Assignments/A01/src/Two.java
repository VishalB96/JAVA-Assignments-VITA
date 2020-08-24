
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new First();
		new First(23);
		new Second();
		new Second(33);
		First a1 = new First(34);
		Second a2 = new Second(45);
		System.out.println(a1.getF1());
		System.out.println(a2.getS1());
	}

}

/**
 * 
 */

/**
 * @author Vishal
 *
 */
public class FourWheeler implements Vehicle {
	private static String GearType[] = {"manual","automatic"};
	
	public FourWheeler(String type) {
		if(!checkType(type)) {System.out.println("Wrong Input");}
	}
	
	public boolean checkType(String type) {
		String CheckA[]= FourWheeler.GearType;
		for(int i = 0 ; i< CheckA.length; i++) {
			if(CheckA[i]==type) {
				System.out.println(type + " is selected");
				return true ;
			}
		}
		return false;
	}
	@Override
	public void start() {
		System.out.println("Four Wheeler Start");

	}
	
}

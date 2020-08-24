
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Rect();
		arr[2] = new Circle();
		
		for(int i=0; i < arr.length ; i++) {
			arr[i].Draw();
		}
	}

}

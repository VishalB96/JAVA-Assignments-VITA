
public class ShapeDemo {
	public static void perform(Shape s) {
		
		s.Draw();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Triangle());
		perform(new Rect());
		perform(new Circle());
	}

}

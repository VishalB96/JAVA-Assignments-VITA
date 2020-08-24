abstract class shape{
	 void draw() {
	}
}
class triangle extends shape{
	void draw() {
		System.out.println("draw triangle");
	}
}
class rect extends shape{
	void draw() {
		System.out.println("draw rectangle");
	}
}
class circle extends shape{
	void cf() {
		System.out.println("CIRCUMFERENCE");
	}
	void draw() {
		System.out.println("draw circle");
	}
}
public class ShapeDemo {
	public static void perform(shape s) {
		if(s instanceof circle) {
			circle b1 = (circle)s;
			b1.cf();
		}
		
		s.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new triangle());
		System.out.println("----------------------------");
		perform(new rect());
		System.out.println("----------------------------");
		perform(new circle());

	}

}

/**
 * 
 */

/**
 * @author Vishal
 *
 */
public class Shape {
	private int width;
	private int height;
	public Shape(){
		this.width=0;
		this.height=0;
	}
	public Shape(int w, int h){
		this.width=w;
		this.height=h;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
}

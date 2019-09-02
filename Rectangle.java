//Displays object measurements, area, and perimeter.//

public class Rectangle {
	public static void main(String[] args) {
		int width = 4;
		int height = 8;
		int area = width * height;
		int perimeter = (height * 2) + (width * 2);
		System.out.println("The width = " + width);
		System.out.println("The height = " + height);
		System.out.println("The area = " + area);
		System.out.println("The perimeter = " + perimeter);
	}
}

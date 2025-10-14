package design_pattern.com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		com.company.liskov_1.Rectangle rectangle = new com.company.liskov_1.Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		com.company.liskov_1.Square square = new com.company.liskov_1.Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
	}

	private static void useRectangle(com.company.liskov_1.Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}

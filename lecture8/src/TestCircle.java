public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(25);
		Circle circle3 = new Circle(125);
		System.out.println(circle1.getArea());
		System.out.println(circle2.getArea());
		System.out.println(circle3.getArea());
	}
}
	
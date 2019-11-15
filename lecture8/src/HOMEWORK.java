

class Circle{
	double radius;
	double getRadius(){
		return radius;
	
	}
	double getArea(){
		return radius*radius*Math.PI;
		
	}
}
public class HOMEWORK {
public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 2.0;
		System.out.println(circle.getArea());
		
	}

}

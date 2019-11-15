
public class CAR2 {
	 private String brand;
	 private int maxSpeed;
	 private String color;
	  
	 
	 
	 public String getBrand(){
		 
	 return this.brand;
}
	 
	 public void setBrand (String brand){
		 this.brand = brand;
	 }
		 

	 public class Task3{
		 
	 }
	public static void main(String[] args) {
		CAR2 car = new CAR2();
		car.setBrand("Ferrari");
		String name = car.getBrand();
		System.out.println("My car name is "+name  );
		
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

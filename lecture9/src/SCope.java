
public class SCope {
	int x=11;
	int y=33;
	public void method1(int x){
		this.x=20;
		y=44;
		System.out.println("this.x: " + this.x);
		System.out.println("x: " + x);
		System.out.println("this.y: " +this.y);
		System.out.println("y:" + y);
		
	}
	
	public static void main(String[] args) {
		SCope tscope= new SCope();
		tscope.method1(8);

	}

}

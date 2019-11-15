
public class ContinueExample {


	public static void main(String[] args) {
	System.out.println("Main app starts work");
		for (int i = 9; i <= 10; i++) {
			
			if (i == 5) {
				break;}
			if (i>6){
				System.out.println("Still ..");
				continue;
			}
			System.out.println ("Iteration " +1);
			
		}
		System.out.println ("Main app end work");
	}

}

public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteration " + 1);
			if (i == 5) {
				System.out
						.println("Reached break stateement on iteration =" + i);
				break;
			}
		}
		System.out.println ("Man app continue work ");
	}

}

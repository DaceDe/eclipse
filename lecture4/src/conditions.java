public class conditions {

	public static void main(String[] args) {
		int a = 1;
		short b = 1;
		int c = 0;
		boolean b1 = a == b;
		boolean b2 = b != c;
		boolean b3 = a > c;

		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);

		if (b1 && b2 && b3) {
			System.out.println("Success!");
		} else {
			System.out.println("Something wrong");

		}

	}
}


public class arrayBasic {


	public static void main(String[] args) {
		int size = 6;
		
		int [] values = new int [4];
		
		System.out.println(values);
		System.out.println(values[0]);
		
		values[0] = 9;
		System.out.println(values[0]);
		System.out.println("----");
		
		int[] values2 = {1,2, 3, 4};
		values2[0] = 9;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		
		System.out.println("array size = "+values.length);		
		System.out.println("--------");
		for(int i = 0; i < values.length; i++){
			System.out.println(values2[i]);
		}		System.out.println("Enhanced loops--------");
		for(int elem : values2){
			System.out.println(elem);
		
		
	}

}
}
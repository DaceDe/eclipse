import java.util.Arrays;
import java.util.Scanner;


public class task1 {

	public static void main(String[] args) {
//		int[] values = new int [10];
//		
//		for (int i=0; i <10; i++){
//		
//			values[i] = i;
//		}
//		for (int i=0; i <10; i++){
//			System.out.println(values[i]);
//		}}}

//		int[] values1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//		for (int i = 0; i < values.length; i++) {
//			System.out.println(values[i]);
//		}
//		
//	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Ievadiet ciparu");
//	int num = scanner.nextInt(-1;
//	String[] dayIndex = {  "Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday" , "Sunday"};
//
//		
//		if (num>8)
//			System.out.println("Wrong!");
//		else
//			System.out.println("Current day is : " + dayIndex[num]);
//	}
//	}
//	{
//	int size = 10;
//	int[] values = { 9,8,7,6,5,4,3,2,1,0 };
//
//	for (int i = 0; i <= values.length; i++) {
//	System.out.println(values[i]);
//}}}
		
		
//		int []myArray = {1, -3, 44, -39};
//		
//		int sum = 0;
//		for (int i =0; i < myArray.length; i++){
//			sum = sum +myArray[i];
//		
//		}
//		System.out.println("The sum is " + sum);
		
//		 int myArray []= { 11, 22, 33, 44, 55, 66, 77, 88, 99};
//		 Scanner scanner = new Scanner(System.in);
//		 
//		 do {
//		 System.out.println("Ievadiet ciparu");
//		
//		 int num = scanner.nextInt();
//		
//		 
//			 for(int i = 0; i<myArray.length; i++){
//		       if(num == myArray[i]){
//		          System.out.println("Array contains the given element");
//		       }else {
//		    	   System.out.println("no such a value");
//		    	   break;
//		       
//			 }while(num==myArray[i]);
//			 
//		 
//	}}}}
			 
		 int[] my_array1 = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
		  System.out.println("Original array : "+ Arrays.toString(my_array1));  
		   for(int i = 0; i < my_array1.length / 2; i++)
		  {
		    int temp = my_array1[i];
		    my_array1[i] = my_array1[my_array1.length - i - 1];
		    my_array1[my_array1.length - i - 1] = temp;
		  }
		    System.out.println("Reverse array : "+Arrays.toString(my_array1));
	}}

   
		
		
//		String[] dayOfWeek = new String[7];
//		dayOfWeek[0] = "Monday";
//		dayOfWeek[1] = "Tuesday";
//		dayOfWeek[2] = "Wednesday";
//		dayOfWeek[3] = "Thursday";
//		dayOfWeek[4] = "Friday";
//		
//		
//		for (String dayName : dayOfWeek) {
//			System.out.println(dayName);
//		}}}
		
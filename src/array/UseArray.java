package array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		int [] numbers = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number you love : ");
		
		for(int j=0; j<numbers.length; j++){
			
			numbers[j] = sc.nextInt();
			
		}
		for(int i=0; i<numbers.length; i++){
		   System.out.println(numbers[i]);
		
		}

	}

}

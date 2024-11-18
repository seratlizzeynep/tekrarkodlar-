package lablar;

import java.util.Scanner;

public class HappySchoolSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter an age:");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		switch (age) {
		case 1:
		case 2:
			System.out.println(" toddler");
			break;
		case 3:
			
		case 4:
			
		case 5:
			System.out.println(" early childhood");
			break;

		case 6:
			
		case 7:
			System.out.println(" young reader");
			break;

		case 8:
			
		case 9:
			
		case 10:
			System.out.println("elementary");
			break;

		case 11:
			
		case 12:
			System.out.println(" middle");
			break;
		case 13:
			System.out.println("impossible");
			break;

		default:
			break;
		}
	}

}

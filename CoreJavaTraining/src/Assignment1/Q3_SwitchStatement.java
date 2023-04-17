package Assignment1;

import java.util.Scanner;

public class Q3_SwitchStatement {

	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
	
	public void lang_a() {

		switch (n){

		case 1: 
			System.out.println("JAVA");
			break;

		case 2:
			System.out.println("Python");
			break;
			
		case 3:
			System.out.println("Ruby");
			break;

		case 4:
			System.out.println("Json");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		

		}

	}
	public void lang_b() {

		switch (n){

		case 1: 
			System.out.println("JAVA");
			break;

		case 2:
			System.out.println("Python");
			break;
			
		case 3:
			System.out.println("Ruby");
			

		case 4:
			System.out.println("Json");
			break;

		default:
			System.out.println("Invalid Input");
			break;
		

		}

	}
	public void lang_c() {

		switch (n){

		case 1: 
			System.out.println("JAVA");
			break;

		case 2:
			System.out.println("Python");
			break;
			
		case 3:
			System.out.println("Ruby");
			break;
			
		default:
			System.out.println("Invalid Input");
			break;

		case 4:
			System.out.println("Json");
			break;

		
		

		}

	}




	public static void main(String[] args) {

		Q3_SwitchStatement s = new Q3_SwitchStatement();

		System.out.println("Method a: ");
		s.lang_a();
		System.out.println();
		System.out.println("Method b without break in case 3: ");
		s.lang_b();
		System.out.println();
		System.out.println("Method c default moved before case 4: ");
		s.lang_c();
		System.out.println();
	}

}

package Assignment1;

import java.util.Scanner;

public class Q6_CalculationNP {

	Scanner s = new Scanner(System.in);
	double a = s.nextDouble();
	double b = s.nextDouble();
	double c;
		
		public double add(){
			
			c = a + b;
			return c;
		}
		
		public float sub() {
			c = a - b;
			return (float) c;
		}
		
		public int mul() {
			c = a*b;
			return (int) c;
		}
		
		public double div() {
			c = a/b;
			return c;
		}

		public static void main(String[] args) {
			
			Q6_CalculationNP s = new Q6_CalculationNP();
			
			System.out.println("Addition: "+s.add());
			System.out.println("Subtraction: "+s.sub());
			System.out.println("Multiplication: "+s.mul());
			System.out.println("division: "+s.div());

		}

	}




package Assignment1;

import java.util.Scanner;

public class Q2_CallMethod {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	public String minOrMax() {
		
		if(n<12) {
			return "Given number is Lessthan 12" ;
		}else if(n==12) {
			return "Given number is equal to 12";
		}
		return "Given number is Greaterthan 12";
	}

	public static void main(String[] args) {
		
		Q2_CallMethod m = new Q2_CallMethod();
		System.out.println(m.minOrMax());

	}

}

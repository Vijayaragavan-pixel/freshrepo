package practice;

import java.util.Scanner;

public class Fibonacci {
	
	static int n1=0,n2=1,n3=0;
	static void printFibonacci(int count) {
		if(count>0) {
			n3 = n1 +n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibonacci(count-1);
		}
	}
	
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	    	   
	    	   System.out.println(i+" "+Math.sqrt(n));
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	
	
	public static void main(String args[]) {
		
		/*int count = 10;
		System.out.print(n1+" "+n2);
		printFibonacci(count-2); */
		
		
	/*int n1=0,n2=1,n3,i,count = 10;
	System.out.print(n1+" "+n2);
	
	
	for(i=2;i<count;i++) {
		n3 = n1+n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 = n3;
		*/
		
		
		 Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	}
	}



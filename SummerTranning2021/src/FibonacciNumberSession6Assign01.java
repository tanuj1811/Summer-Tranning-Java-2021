//Printing fibonacci numbers using recursion


import java.io.IOException;
import java.util.Scanner;

public class FibonacciNumberSession6Assign01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("/**** Printing Fibonacci Number Using Recursion ****/");
		
		System.out.print("Enter the number :");
		int n = sc.nextInt();
		
		int f1= 0,f2 = 1;
		System.out.print("[ "+ f1 +", " + f2 + ", ");
		fibonacci(n-2,f1,f2);
		
		sc.close();

	}

	private static void fibonacci(int n, int f1, int f2) {
		
		if(n>0) {
			int temp = f1 + f2;

			//Swaping
			f1 = f2;
			f2 = temp;
			if(n == 1)
				System.out.print(temp + " ]");
			else
				System.out.print(temp + ", ");
			
			//recursion
			fibonacci(n-1, f1, f2);
			
		}
	}

}

package tryCatch;
/**
 * Exception Handling
 * @author Zainal Fahrudin
 * Pondok Programmer, 17 Oct 2015
 */

import java.util.Scanner;

public class AritmeticException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan angka : ");
		int x= input.nextInt();
		
		try{
			System.out.println(x/0);
		}catch(ArithmeticException e){
			System.out.println("Arithmeric Error");
			System.out.println("getMessage() : "+e.getMessage());
			System.out.println("toString() : "+e.toString());
			System.out.print("printStackTrace() : ");
			e.printStackTrace();
		}
		
		input.close();
	}
}

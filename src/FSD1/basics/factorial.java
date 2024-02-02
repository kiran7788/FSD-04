package FSD1.basics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number :");
		int b=1;
		int a = scanner.nextInt();
		for(int i=1; i<=a ; i++)
		{
			b=b*i;
			
		}
		System.out.println(b);
	}
}

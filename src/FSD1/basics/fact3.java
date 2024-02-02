package FSD1.basics;

import java.util.Scanner;

public class fact3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number :");
		int b=1;
		int i =1;
		int a = scanner.nextInt();
		do
		{
			b=b*i;
			i++;
		}while (i<=a);
		System.out.println(b);

	}

}

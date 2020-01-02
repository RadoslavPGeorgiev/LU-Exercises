package exercise;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.print("Въведете числото и след него степента: ");
		Scanner sc = new Scanner(System.in);
		double number =sc.nextDouble();
        double stepen =sc.nextDouble();
        float result =(float) Math.pow(number, stepen);
		System.out.println(result);
		sc.close();

	}
}

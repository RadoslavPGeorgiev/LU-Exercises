package exercise;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		System.out.print("Въведете секунди: ");
		Scanner sc = new Scanner(System.in);
		int seconds =sc.nextInt();
		int minutes = seconds/60;
		int remainingSeconds = seconds%60;
		System.out.printf("Ако имаме %d, то това е минути %d и секунди %d.",  seconds, minutes, remainingSeconds);
		sc.close();

	}

}

package exercise;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.print("Въведете началният ден и колко дни напред искате : ");
		Scanner sc = new Scanner(System.in);
		String startingDay=sc.next();
		String resultDay="";
		String endresultDay="";
		switch(startingDay)
		{
			case "Понеделник": resultDay = "MONDAY"; break;
			case "Вторник": resultDay = "TUESDAY"; break;
			case "Сряда": resultDay =  "WEDNESDAY";break;
			case "Четвъртък": resultDay = "THURSDAY"; break;
			case "Петък": resultDay = "FRIDAY"; break;
			case "Събота": resultDay = "SATURDAY"; break;
			case "Неделя": resultDay = "SUNDAY"; break;
		}
		int numberOfDaysAhead=sc.nextInt();		
		switch(DayOfWeek.valueOf(resultDay).plus(numberOfDaysAhead).toString())
		{
			case "MONDAY": endresultDay = "Понеделник"; break;
			case "TUESDAY": endresultDay = "Вторник"; break;
			case "WEDNESDAY": endresultDay =  "Сряда";break;
			case "THURSDAY": endresultDay = "Четвъртък"; break;
			case "FRIDAY": endresultDay = "Петък"; break;
			case "SATURDAY": endresultDay = "Събота"; break;
			case "SUNDAY": endresultDay = "Неделя"; break;
		}
		
		System.out.printf("След %d дена ще бъде %s.", numberOfDaysAhead , endresultDay );
		sc.close();

	}

}

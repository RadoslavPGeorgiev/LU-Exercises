package exercise;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		System.out.print("�������� ��������� ��� � ����� ��� ������ ������ : ");
		Scanner sc = new Scanner(System.in);
		String startingDay=sc.next();
		String resultDay="";
		String endresultDay="";
		switch(startingDay)
		{
			case "����������": resultDay = "MONDAY"; break;
			case "�������": resultDay = "TUESDAY"; break;
			case "�����": resultDay =  "WEDNESDAY";break;
			case "���������": resultDay = "THURSDAY"; break;
			case "�����": resultDay = "FRIDAY"; break;
			case "������": resultDay = "SATURDAY"; break;
			case "������": resultDay = "SUNDAY"; break;
		}
		int numberOfDaysAhead=sc.nextInt();		
		switch(DayOfWeek.valueOf(resultDay).plus(numberOfDaysAhead).toString())
		{
			case "MONDAY": endresultDay = "����������"; break;
			case "TUESDAY": endresultDay = "�������"; break;
			case "WEDNESDAY": endresultDay =  "�����";break;
			case "THURSDAY": endresultDay = "���������"; break;
			case "FRIDAY": endresultDay = "�����"; break;
			case "SATURDAY": endresultDay = "������"; break;
			case "SUNDAY": endresultDay = "������"; break;
		}
		
		System.out.printf("���� %d ���� �� ���� %s.", numberOfDaysAhead , endresultDay );
		sc.close();

	}

}

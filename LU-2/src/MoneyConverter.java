import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Choose a currency to convert from to: ");
        System.out.println("1. Pound to lev");
        System.out.println("2. Euro to lev");
        System.out.println("3. Dollar to lev");

        int initialInput = sc.nextInt();
        System.out.println("How much money do you want to convert? ");
        double inputSum = sc.nextDouble();

        Conversion(initialInput, inputSum, df);
    }

    public static void Conversion(int input, double inputSum, DecimalFormat df) {
        double resultSum = 0;

        switch (input) {
            case 1:
                resultSum = inputSum * 2.29229;
                System.out.println(inputSum + " Pounds = " + df.format(resultSum) + " leva");
                break;
            case 2:
                resultSum = inputSum * 1.95583;
                System.out.println(inputSum + " Euros = " + df.format(resultSum) + " leva");
                break;
            case 3:
                resultSum = inputSum * 1.79549;
                System.out.println(inputSum + " Dollars = " + df.format(resultSum) + " leva");
                break;
            default:
                System.out.println("Invalid choice for currency. ");
        }

    }
}
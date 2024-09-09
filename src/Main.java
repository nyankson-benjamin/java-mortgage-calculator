import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner mort = new Scanner(System.in);
        System.out.print("principal: ");
        int p = mort.nextInt();
        while(p <10000 || p>1000000){
            System.out.print("Enter a number between 1,000 and 1,000,000: ");
             p = mort.nextInt();
        }
        System.out.print("Annual interest: ");
        float r = mort.nextFloat();

        while(r < 0 || r>30){
            System.out.print("Enter a value greater than 0 and less than or equal to 30: ");
            r = mort.nextFloat();
        }
        System.out.print("Period(years): ");
        int n = mort.nextInt();

        while (n<1 || n > 30){
            System.out.println("Enter a value between 1 and 30: ");
            n = mort.nextInt();

        }

        byte PERCENT = 100;
        byte MONTH_IN_YEARS =12;
        double rate = r / PERCENT / MONTH_IN_YEARS;
        int years = n*12;
        double sqr = Math.pow((1 + rate), years);
        double x = rate * sqr;
        double y = sqr - 1;
        double res = p * (x / y);
        String result = NumberFormat.getCurrencyInstance().format(res);
        System.out.println("Mortgage: " + result);
    }
}
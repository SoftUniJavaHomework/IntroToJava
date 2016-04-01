import java.util.Scanner;

/**
 * Created by pc on 19.3.2016 г..
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter three numbers:");
        double firstNumber = Double.parseDouble(console.nextLine());
        double secondNumber = Double.parseDouble(console.nextLine());
        double thirdNumber = Double.parseDouble(console.nextLine());

        double average = findAverage(firstNumber, secondNumber, thirdNumber);
        System.out.println(String.format("%.2f", average));
    }

    private static double findAverage(double firstNumber, double secondNumber, double thirdNumber) {
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        return average;
    }
}

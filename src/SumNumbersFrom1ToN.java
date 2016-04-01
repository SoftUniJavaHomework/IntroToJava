import java.util.Scanner;

/**
 * Created by pc on 19.3.2016 г..
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int n = Integer.parseInt(console.nextLine());

        long sum =0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}

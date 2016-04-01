import java.util.Scanner;

/**
 * Created by pc on 19.3.2016 г..
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++){
            for (char ch = 'a'; ch <= 'a' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--){
            for (char ch = 'a'; ch <= 'a' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

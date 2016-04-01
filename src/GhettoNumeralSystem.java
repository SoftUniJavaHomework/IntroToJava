import java.util.Scanner;

/**
 * Created by pc on 19.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        System.out.println("Please, enter a number:");
        Scanner console = new Scanner(System.in);
        Integer number = console.nextInt();
        String convertedNumberToGhetto = convertNumberToGhetto(number);
        System.out.println(convertedNumberToGhetto);
    }

    private static String convertNumberToGhetto(Integer number) {
        String numberAsString = number.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i < numberAsString.length(); i++) {
            ghettoNumber.append(convertDigitInGhetto(numberAsString.charAt(i)));
        }
        return ghettoNumber.toString();
    }

    private static String convertDigitInGhetto(char digit) {
        String ghettoDigit = " ";
        switch (digit) {
            case '0': ghettoDigit = "Gee";
                break;
            case '1':  ghettoDigit ="Bro";
                break;
            case '2': ghettoDigit = "Zuz";
                break;
            case '3': ghettoDigit ="Ma";
                break;
            case '4': ghettoDigit ="Duh";
                break;
            case '5': ghettoDigit = "Yo";
                break;
            case '6': ghettoDigit = "Dis";
                break;
            case '7': ghettoDigit = "Hood";
                break;
            case '8': ghettoDigit ="Jam";
                break;
            case '9': ghettoDigit = "Mack";
                break;
            default:
                break;
        }
        return ghettoDigit;
    }
}

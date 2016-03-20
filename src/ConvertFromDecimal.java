import java.util.Scanner;

public class ConvertFromDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberToConvert = console.nextInt();

        System.out.println(Integer.toString(numberToConvert,7));

    }
}

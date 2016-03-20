import java.util.Scanner;

public class ConvertFromBase7toDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String numberToConvert = console.next();
        Integer decimalNumber = Integer.valueOf(numberToConvert,7);
        System.out.println(decimalNumber);
    }
}

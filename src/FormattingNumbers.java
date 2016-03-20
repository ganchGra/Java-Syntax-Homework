
import java.util.Scanner;
import java.util.StringJoiner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner inputA = new Scanner(System.in);
        Scanner inputB = new Scanner(System.in);
        Scanner inputC = new Scanner(System.in);
        int a = inputA.nextInt();
        float b = inputB.nextFloat();
        float c = inputC.nextFloat();
        String numbertToBinary = String.format("%10s",Integer.toBinaryString(a)).replace(' ','0');

        System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|",a,numbertToBinary,b,c);
    }
}


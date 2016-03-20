import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (97 + j) + " ");
            }
            System.out.println();
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }
    }
}


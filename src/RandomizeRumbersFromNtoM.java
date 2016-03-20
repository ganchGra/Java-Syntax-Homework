import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;
public class RandomizeRumbersFromNtoM {
    public static void main(String[] args) {
        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);

        int n = firstInput.nextInt();
        int m = secondInput.nextInt();

        int min = Math.min(n,m);
        int max = Math.max(n,m);
        Random rnd = new Random();

        for (int i = min; i < max ; i++) {
            int randNum = rnd.nextInt((max - min) + 1) + min;
            System.out.print(randNum + " ");
       }
    }
}

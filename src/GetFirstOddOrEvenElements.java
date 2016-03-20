import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Scanner consoleInput2 = new Scanner(System.in);

        String[] firstArray = consoleInput.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {

        }

        String[] secondArray = consoleInput2.nextLine().split(" ");
        int numOfElements = Integer.parseInt(secondArray[1]);
        String type = secondArray[2];

        GetOddOrEven(numbers,numOfElements,type);
    }

    private static int GetOddOrEven(String numbers,int numOfElements, String type ){
        String[] arrayOfNum = numbers.split(" ");

        for (int i = 0; i < arrayOfNum.length; i++) {
            int num = Integer.parseInt(arrayOfNum[i]);

            if (type =="even" && num%2 == 0 && numOfElements != 0){
                System.out.printf("%s ",num);
                numOfElements--;
            }
            if (type =="odd" && num%2 != 0 && numOfElements != 0){
                System.out.printf("%s ",num);
                numOfElements--;
            }
        }

        System.out.println();
        return 1;
        //trqbva da napravq list
    }
}

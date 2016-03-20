
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        Scanner consoleInput2 = new Scanner(System.in);

        String numbers = consoleInput.nextLine();

        String[] secondArray = consoleInput2.nextLine().split(" ");
        int numOfElements = Integer.parseInt(secondArray[1]);
        String type = secondArray[2];
        String result = "";
        System.out.println(GetOddOrEven(result,numbers,numOfElements,type));
    }

    private static String GetOddOrEven(String result, String numbers,int numOfElements, String type ){
        String[] arrayOfNum = numbers.split(" ");

        for (int i = 0; i < arrayOfNum.length; i++) {
            int num = Integer.parseInt(arrayOfNum[i]);

            if (type.equals("even") && num%2 == 0 && numOfElements != 0){
                result += num + " ";
                numOfElements--;
            }
            if (type.equals("odd") && num%2 != 0 && numOfElements != 0){
                result += num + " ";
                numOfElements--;
            }
        }
        return result;
    }
}

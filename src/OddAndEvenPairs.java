import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] array = console.nextLine().split(" ");
        if (array.length % 2 !=0){
            System.out.println("Invalid lenght");
        }
        else {
            for (int i = 0; i < array.length ; i+=2) {
                int firstNum = Integer.parseInt(array[i]);
                int secondNum = Integer.parseInt(array[i + 1]);

                if (firstNum%2 == 0 && secondNum%2 ==0){
                    System.out.format("%d , %d -> both are even ",firstNum,secondNum);
                    System.out.println();
                }
                else if(firstNum%2 != 0 && secondNum%2 !=0){
                    System.out.format("%d , %d -> both are odd ",firstNum,secondNum);
                    System.out.println();
                }
                else if(firstNum%2 != 0 && secondNum%2 ==0 ||firstNum%2 == 0 && secondNum%2 !=0){
                    System.out.format("%d , %d ->different ",firstNum,secondNum);
                    System.out.println();
                }
            }
        }
    }
}

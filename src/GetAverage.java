import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args){
        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);
        Scanner thirdInput = new Scanner(System.in);

        float firstNum = firstInput.nextFloat();
        float secondNum = firstInput.nextFloat();
        float thirdNum = firstInput.nextFloat();
        calculateAverage(firstNum,secondNum,thirdNum);
    }

    private static void calculateAverage(float firstNum, float secondNum, float thirdNum){
        double avg = (firstNum + secondNum + thirdNum)/ 3d;
        System.out.printf("%.2f",avg);
    }
}

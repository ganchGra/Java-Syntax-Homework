import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        String firstStr = input[0];
        String secondStr = input[1];
        int sum = 0;
        CharacterMultiplier(firstStr,secondStr,sum);
    }

    private static int CharacterMultiplier(String firstStr, String secondStr,int sum){

        if (firstStr.length() == secondStr.length()){
            for (int i = 0; i <firstStr.length() ; i++) {
                sum += firstStr.charAt(i) * secondStr.charAt(i);
            }
        }

        if (firstStr.length() > secondStr.length()){
            int count = 0;
            for (int i = 0; i < secondStr.length() ; i++) {
                sum += firstStr.charAt(i) * secondStr.charAt(i);
                count++;
            }
            for (int i = count; i < firstStr.length(); i++) {
                sum += firstStr.charAt(i);
            }
        }

        if (firstStr.length() < secondStr.length()) {
            int count = 0;
            for (int i = 0; i < firstStr.length(); i++) {
                sum += firstStr.charAt(i) * secondStr.charAt(i);
                count++;
            }
            for (int i = count; i < secondStr.length(); i++) {
                sum += secondStr.charAt(i);
            }
        }
        System.out.println(sum);
        return sum;
    }
}

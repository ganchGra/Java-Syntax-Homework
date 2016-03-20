import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        String ghetto = "";
        ghettoName(number,ghetto);
    }

    private static void ghettoName(String number, String ghetto) {
        for (int i = 0; i < number.length(); i++) {

            switch (number.charAt(i)) {
                case '0':
                    ghetto += "Gee";
                    break;
                case '1':
                    ghetto += "Bro";
                    break;
                case '2':
                    ghetto += "Zuz";
                    break;
                case '3':
                    ghetto += "Ma";
                    break;
                case '4':
                    ghetto += "Duh";
                    break;
                case '5':
                    ghetto += "Yo";
                    break;
                case '6':
                    ghetto += "Dis";
                    break;
                case '7':
                    ghetto += "Hood";
                    break;
                case '8':
                    ghetto += "Jam";
                    break;
                case '9':
                    ghetto += "Mack";
                    break;
                default:
                    break;
            }
        }

        System.out.println(ghetto);
    }
}

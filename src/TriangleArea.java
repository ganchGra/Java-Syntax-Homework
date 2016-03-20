import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner firstPlane = new Scanner(System.in);
        Scanner secondPlane = new Scanner(System.in);
        Scanner thirdPlane = new Scanner(System.in);

        int xFirstPlane = firstPlane.nextInt();
        int yFirstPlane = firstPlane.nextInt();

        int xSecondPlane = secondPlane.nextInt();
        int ySecondPlane = secondPlane.nextInt();

        int xThirdPlane = thirdPlane.nextInt();
        int yThirdPlane = thirdPlane.nextInt();

        int areaTriangle = (xFirstPlane * (ySecondPlane - yThirdPlane) +
                xSecondPlane * (yThirdPlane - yFirstPlane) +
                xThirdPlane * (yFirstPlane - ySecondPlane)) / 2;
        System.out.println(areaTriangle);
    }
}

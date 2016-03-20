import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        //first formula
        double grade = (a + b + c)/ Math.sqrt(c);
        double firstPart = (Math.pow(a,2) + Math.pow(b,2)) / (Math.pow(a,2) - Math.pow(b,2));
        double firstFormula = Math.pow(firstPart,grade);
        //second formula
        double secondFormula= Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)),(a-b));

        double avgNumbers = (a + b + c)/3d;
        double avgFormulae = (firstFormula + secondFormula)/2d;
        double diff = Math.abs(avgFormulae - avgNumbers);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormula,secondFormula,diff);


    }
}
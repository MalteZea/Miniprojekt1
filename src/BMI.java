import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {
    public static double bodyMassIndex () {
        Scanner input = new Scanner(System.in);

        System.out.println("Du har nu valgt Team United's BMI ULTRA ACCURATE udregningsprogram.");
        System.out.print("Indtast din vægt i kg, f.eks. 78,3: ");
        double weight = input.nextFloat();

        System.out.print("Indtast din højde i meter, f.eks. 1,8: ");
        double height = input.nextFloat();

        double result = weight / Math.pow(height, 2);

        DecimalFormat df = new DecimalFormat("0.#");
        String formatResult = df.format(result);

        System.out.println("Din ULTRA ACCURATE BMI er " + formatResult);

        return result;
    }
}

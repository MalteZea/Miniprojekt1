import java.util.Scanner;

public class BMI {
    public static double bodyMassIndex () {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast din vægt i kg, f.eks. 78,3: ");
        double weight = input.nextFloat();

        System.out.print("Indtast din højde i meter, f.eks. 1,8: ");
        double height = input.nextFloat();

        double result = weight / Math.pow(height, 2);

        System.out.println("Din BMI er " + result);

        return result;
    }
}

import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        System.out.println("Velkommen til minicomputer!");

        for (int i = 0; i < 6; i++) {

            System.out.print("Hvilket miniprogram vil du køre [1..9]? ");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            // Dine if sætninger skal komme her
            // Bil.dyt();
            if ( x == 1) { Terning.kast(); }
            if ( x == 2) { Lottotal.PickANumber(); }
            if ( x == 3) { BMI.bodyMassIndex(); }
            if ( x == 5) { SelectAMovieSerie.selectMovieSerie(); }

        }

        System.out.println("Farvel!");

    }

}

public class Lottotal {

    public static int PickANumber() {

        double resultat = Math.random() * (90 - 1 + 1) + 1;
        System.out.println("Nummeret du har trukket er: " + (int) resultat);
        return (int) resultat;
    }

}
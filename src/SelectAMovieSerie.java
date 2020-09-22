import java.util.Random;

public class SelectAMovieSerie {

    public static void selectMovieSerie() {
        String[] arr = new String[]{"Gurli Gris", "Postmand Per", "Peter Pedal", "Paw patrol", "Byggemand Bob"};
        Random movie = new Random();
        int randomMovieSeries = movie.nextInt(arr.length);
        System.out.println("Jeg kan forstå, at du har svært ved at vælge hvad du skal se?");
        System.out.println("Jeg foreslår at du i dag skal se: " + arr[randomMovieSeries] + ", selv tak :D");
    }
}

import java.util.Collections;
import java.util.ArrayList;

public class Lottotal {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        for(int i = 0; i < 90; i++)
        {
            numbers.add(i+1);
        }
        Collections.shuffle(numbers);
        System.out.print("De syv lottotal er i denne uge: ");
        for(int j =0; j < 7; j++) {
            System.out.print(numbers.get(j) + " ");
        }
    }
}
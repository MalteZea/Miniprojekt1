import java.util.Scanner;

    public class RandomJoke {
        public static void RandomJoke() {
            Scanner input = new Scanner(System.in);

            System.out.print("Please choose a number for a joke, 1 to 4 : ");

            int num = input.nextInt();
            if (num == 1) {
                System.out.println("“Dad, I got my smarts from you, didn’t I?” \n- “That’s right my clever boy!” - “Yup, thought so, mom still has hers. ");
            } else if (num == 2) {
                System.out.println("Internet discussion: \nuser kiki357: HEEEEY, HOW ARE YOU? I’M NEW HERE! \nuser ukili: Try pressing CapsLock. \nuser kiki357: AWESOME, NOW I DON’T HAVE TO KEEP PRESSING SHIFT!!!!");
            } else if (num == 3) {
                System.out.println("What is the worst combination of illnesses? \n- Alzheimer’s and diarrhea. You’re running, but can’t remember where.");
            } else if (num == 4) {
                System.out.println("There are only 10 types of people in the world:\n those who understand binary, and those who don't.");
            }

        }
    }

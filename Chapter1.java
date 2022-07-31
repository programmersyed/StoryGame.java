import java.util.Locale;
import java.util.Scanner;

    public class Chapter1 {
        public static void main(String args[]) {

            System.out.println("What is your name?");

            Scanner nam = new Scanner(System.in);
            String name = nam.nextLine();

            System.out.println("Welcome Detective " + name);
            System.out.println("It appears that the city needs you");
            System.out.println("Crime is rampant here in New Domino City and we are in need of a detective of your calibre");
            System.out.println("Your first task will be against Dirty Dan");
            System.out.println("Guess what mumber dan is thinking in order to catch him");
            System.out.println("We have narrowed it between 1 and 5");

            int chap = nam.nextInt();

            while (chap != 3) {
                System.out.println("Guess again");
                chap = nam.nextInt();
            }

            System.out.println("Good guess Detective");
            System.out.println("Thanks to your help we have located Dirty Dan");
            System.out.println("Its time for us to get him");

            String[] pop = {"Red", "Blue", "Green"};

            System.out.println("There are 3 doors");
            System.out.println("Pick a door by its color in order to seize him");

            for (int i = 0; i <= pop.length - 1; i++) {
                System.out.println("Door" + (i + 1));
                System.out.println(pop[i]);
            }
            Scanner pete = new Scanner(System.in);

            String selection = pete.nextLine();
            String select = selection.toLowerCase();

            switch (select) {
                case "red":
                    System.out.println("That was the correct choice");
                    System.out.println("Dirty Dan has been apprehended and sent to the police");
                    System.out.println("Thank you for your hard work!");
                    System.out.println("First chapter completed");
                    break;
                case "blue":
                case "green":
                    System.out.println("Game Over");
                    break;
                default:
                    System.out.println("Invalid Answer");
                    System.out.println("Game Over.");
                    break;
            }
            int [][] Duke = {{15,25,35},
                    {16,19,29}};
            System.out.println(Duke[1][0]+" dollars for you!");
            }
        }

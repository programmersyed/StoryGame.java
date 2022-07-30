import java.util.Scanner;

public class Chapter1 {
    public static void main(String args[]){
        System.out.println("What is your name?");
        Scanner nam = new Scanner(System.in);
        String name = nam.nextLine();
        System.out.println("Welcome Detective "+name);
        System.out.println("It appears that the city needs you. Crime is rampant here in New Domino City and we are in need of a detective of your calibre");
        System.out.println("Your first task will be against dirty dan");
        System.out.println("Guess what mumber dan is thinking in order to catch him");
        int chap= nam.nextInt();
        while (chap != 3){
            System.out.println("Guess again");
            chap=nam.nextInt();
        }
        System.out.println("Good guess detective");
        System.out.println("Thanks to your help we have located Dirty Dan");
        System.out.println("Its time for us to get him");
        int[] dan = {12,14,15};

    }
}

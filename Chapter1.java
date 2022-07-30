import java.util.Scanner;

public class Chapter1 {
    public static void main(String args[]){
        System.out.println("What is your name?");
        Scanner nam = new Scanner(System.in);
        String name = nam.nextLine();
        System.out.println("Welcome Detective "+name);
        System.out.println("It appears that the city needs you. Crime is rampant here in New Domino City and we are in need of a detective of your calibre");
        System.out.println("Pick a number between one and 3");
        int chap = nam.nextInt();
        
        }

    }
}

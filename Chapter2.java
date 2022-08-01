import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        System.out.println("Detective we need your help in order to find Larry the Liar");
        System.out.println("Find the sum of all numbers going to 10");
        Scanner Puy = new Scanner(System.in);
        int answer = Puy.nextInt();
        int result = sum(10);
        while (result != answer){
            System.out.println("Please try again");
            answer = Puy.nextInt();
        }
//Recursions downward
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    //End of Recursion





}
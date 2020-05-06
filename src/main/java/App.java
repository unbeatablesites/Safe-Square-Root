import java.util.Scanner;

public class App {

    public static void main(String[] args) {

    }

    static void logic(){
        System.out.println("SQUARE ROOT!\n");

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        double squareRoot = Math.sqrt(userInput);
    }
}

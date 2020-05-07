import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();
    }

    static void logic(){
        System.out.println("SQUARE ROOT!\n");



        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        while (userInput < 0){
            System.out.println("You can't take the square root of a negative number, silly.\n");
            System.out.print("Enter a number: ");
            userInput = scan.nextInt();
        }
        double squareRoot = Math.sqrt(userInput);
        System.out.println(squareRoot);

    }
}

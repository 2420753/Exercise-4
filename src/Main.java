import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        int[] userArray = new int[3];

        System.out.println("Enter 3 numbers please");


        // Asking user for input:
        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            userArray[i] = stdin.nextInt();
        }


        // Numbers set by program
        int[] checkingArray = {1, 3, 4, 18};
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < checkingArray.length; j++) {
                if (userArray[i] == checkingArray[j]) {
                    userArray[i] = 0;
                }
            }

        }

        for (int num : userArray) {
            System.out.print("Array after being modified: " + num + "\n");
        }


    }
}
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int answer = sum2();

    }

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int summe = num1 + num2;
        System.out.println("The sum is: " + summe);
    }

        /*access modifier      return_type     name () {
        //body
        return statement;
    }
         */
}

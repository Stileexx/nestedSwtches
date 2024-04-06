import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        //Q: Take input of 2 nums and print sum
        Scanner in = new Scanner(System.in);

        //define type of multiple variables(to remove *int* before them)
        int num1,num2,sum;


        System.out.println("Enter the first number: ");
        num1 = in.nextInt();


        System.out.println("Enter second number: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is: " + sum);


    }
}

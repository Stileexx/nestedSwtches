import java.sql.SQLOutput;
import java.util.Scanner;

public class Casing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweat red fruit");
                break;
            case "Banana":
                System.out.println("A long yellow fruit");
                break;
            case "Orange":
                System.out.println("A round fruit");
                break;
            default:
                System.out.println("Please valid a valid fruit");
        }
    }
}

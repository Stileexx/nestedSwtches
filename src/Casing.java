import java.util.Scanner;

public class Casing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweat red fruit");
            case "Banana" -> System.out.println("A long yellow fruit");
            case "Orange" -> System.out.println("A round fruit");
            default -> System.out.println("Please valid a valid fruit");
        }
    }
}

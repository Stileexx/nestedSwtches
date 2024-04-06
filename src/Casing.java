import java.util.Scanner;

public class Casing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweat red fruit");
//            case "Banana" -> System.out.println("A long yellow fruit");
//            case "Orange" -> System.out.println("A round fruit");
//            default -> System.out.println("Please valid a valid fruit");
//        }
//
        int day = input.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }


//        Enhanced Switch Statement
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }

        //Normal Switch Statement
        switch (day) {
              case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");

        }
    }
}

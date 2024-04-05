import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employerID = input.nextInt();
        String department = input.next();

        switch (employerID) {
            case 1:
                System.out.println("Steven Utcke");
                break;
            case 2:
                System.out.println("Slawa Suppes");
                break;
            case 3:
                System.out.println("Nick Stettnisch");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Managment":
                        System.out.println("Managment Department");
                        break;
                    default:
                        System.out.println("Not a valid department!");
                }
                break;
            default:
                System.out.println("Not a valid Employed ID!");
        }
    }
}

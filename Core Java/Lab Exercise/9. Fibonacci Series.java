import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Say Hello\n2. Say Goodbye\n3. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Goodbye!");
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

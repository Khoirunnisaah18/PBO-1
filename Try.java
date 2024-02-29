import java.util.Scanner;
//class
public class Try {
    //method
    public static void main(String[] args) {
        //statement
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Mahasiswa");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    loginAsMahasiswa(input);
                    break;
                case 2:
                    loginAsAdmin(input);
                    break;
                case 3:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }

        } while (choice != 3);

        input.close();
    }

    private static void loginAsMahasiswa(Scanner scanner) {
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();

        if (isValidMahasiswaNIM(nim)) {
            System.out.println("Successful Login as Mahasiswa");
        } else {
            System.out.println("User Not Found");
        }
    }

    private static boolean isValidMahasiswaNIM(String nim) {
        return nim.length() == 15 && nim.matches("\\d+");
    }

    private static void loginAsAdmin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        if (isValidAdminCredentials(username, password)) {
            System.out.println("Successful Login as an Admin");
        } else {
            System.out.println("Admin User Not Found");
        }
    }

    private static boolean isValidAdminCredentials(String username, String password){
        return username.length() == 5 && password.length() == 5;
    }
}
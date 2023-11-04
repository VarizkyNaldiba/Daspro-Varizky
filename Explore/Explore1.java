import java.util.Scanner;

public class Explore1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username, next, role, uid;
        String[][] roaster = new String[5][5];

        while (true) {

            System.out.println("Masukkan username anda");
            username = scan.nextLine();
            System.out.println("Masukkan role anda : ");
            role = scan.nextLine();
            System.out.println("Masukkan UID anda : ");
            uid = scan.nextLine();

            System.out.println(" Masih ada roaster selanjutnya? y/t : ");
            next = scan.nextLine();

            if (next.equalsIgnoreCase("t")) {
                break;
            }
        }
    }
}
// iseng iseng eh nerapin ke registrasi :V

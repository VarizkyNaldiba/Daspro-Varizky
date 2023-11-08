import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';

        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1 - 10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer > number) {
                    System.out.print("Angka yang Anda masukkan terlalu besar.");
                } else if (answer < number) {
                    System.out.print("Angka yang Anda masukkan terlalu kecil.");
                } else {
                    success = true;
                }
            } while (!success);
            System.out.print("Jawaban Anda Benar");
            System.out.print("Apakah anda ingin mengulang permainan (Y/t) ? ");
            menu = sc.nextLine().charAt(0);
        }while (menu == 'y' || menu == 'Y');
    }
}
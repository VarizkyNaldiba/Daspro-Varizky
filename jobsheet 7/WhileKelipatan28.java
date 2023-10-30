import java.util.Scanner;

public class WhileKelipatan28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelipatan, jumlah=0, counter=0, mean=0;

        System.out.println("Masukkan bilangan kelipatan 1 - 9 : ");
        kelipatan = sc.nextInt();

        int i = 0;

        while (i < 50) {
            jumlah += i;
            counter++;
            mean = jumlah / counter;
            i++;            
        }
            System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50  adalah %d\n", kelipatan, jumlah);
            System.out.printf("Rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n" , kelipatan, mean);
    }   
}

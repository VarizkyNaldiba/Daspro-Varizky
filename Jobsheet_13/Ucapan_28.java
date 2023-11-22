import java.util.Scanner;

public class Ucapan_28 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.next();
        sc.close();
        return namaOrang;     
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you" + nama + "\nMay The Force Be With You");
    }
}

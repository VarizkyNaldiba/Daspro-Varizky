import java.util.Scanner;

public class Tugas2Rekursif {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int nilaiSebelumnya = penjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
            return n + nilaiSebelumnya;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int bilangan = sc.nextInt();

        int hasilPenjumlahan = penjumlahanRekursif(bilangan);

        System.out.println(" = " + hasilPenjumlahan);
    }
}

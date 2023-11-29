import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrima(int n, int angka) {
        if (n <= 1) {
            return false;
        }
        if (angka == 1) {
            return true;
        }
        if (n % angka == 0) {
            return false;
        }
        return cekPrima(n, angka - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk diperiksa: ");
        int bilangan = sc.nextInt();

        if (cekPrima(bilangan, bilangan - 1)) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}

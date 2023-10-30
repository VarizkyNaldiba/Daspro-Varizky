import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];
        System.out.println("Masukkan elemen array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i+1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        int max = arrayInt[0];
        int min = arrayInt[0];
        int total = arrayInt[0];
        for (int i = 1; i < n; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
            total += arrayInt[i];
        }

        double average = (double) total / n;
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);
    }
}
package Jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2, rata2lulus = 0, rata2tdklulus = 0;
        int lulus = 0, tdklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                rata2lulus += nilaiMhs[i];
                lulus++;
            } else {
                rata2tdklulus += nilaiMhs[i];
                tdklulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        rata2lulus /= lulus;
        rata2tdklulus /= tdklulus;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Rata-rata nilai lulus = " + rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2tdklulus);
    }
}
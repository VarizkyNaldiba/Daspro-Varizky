package Jobsheet9;
import java.util.Scanner;

public class ArrayNilai28 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir ke-" +i+ " : ");
            nilaiAkhir[i] = input.nextInt(); 
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-" +i+ " adalah " + nilaiAkhir[i]);
        }
    }
}
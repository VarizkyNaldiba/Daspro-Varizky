import java.util.Scanner;
import java.util.Arrays;

public class NestedLoop_2341720243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [][] temps = new double [5][7];

        for (int i = 0 ; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                    System.out.println("Hari ke-" + (j + 1) + " : ");
                    temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0 ; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + " : ");
            for (double temp : temps[i]) {
                    System.out.println(temp + " ");
            }
            double sum = 0;
            for (double temp : temps[i]) {
                    sum += temp;
            }
            double average = sum / temps[i].length;
            System.out.println("Rata-rata: " + average);
            System.out.println();
        }
    }
}
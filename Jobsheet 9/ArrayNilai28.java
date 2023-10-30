    package Jobsheet9;
    import java.util.Scanner;

    public class ArrayNilai28 {
        public static void main(String[] args) {

            int[] nilaiAkhir = new int[10];
            Scanner input = new Scanner(System.in);
            
            for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.println("Masukkan nilai akhir ke-" +i+ " : ");
                nilaiAkhir[i] = input.nextInt(); 
            }
            for (int i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70 ) {
                System.out.println("Mahasiswa ke-" +i+ " Lulus! Dengan Nilai " + nilaiAkhir[i] );
                } else
                System.out.println("Mahasiswa ke-" +i+ " tidak Lulus! Dengan Nilai " + nilaiAkhir[i] );
            }
        }
    }
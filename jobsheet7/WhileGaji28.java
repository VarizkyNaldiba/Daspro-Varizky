import java.util.Scanner;

public class WhileGaji28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String jabatan;
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;

        System.out.println("Masukkan jumlah Karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur - Manajer - Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ":"); 
            jabatan = scan.next();
            System.out.println("Masukkan jumlah Jam Lembur: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if  (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;               
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
           totalGajiLembur += gajiLembur;       
        }           
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
    
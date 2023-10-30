import java.util.Scanner;

public class Gaji29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, GajiPerHr, PotGajiPerHr, TotGaji;

        System.out.println("Masukkan jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=sc.nextInt();

        System.out.println("Masukkan Gaji yang di terima per hari ");
        GajiPerHr=sc.nextInt();

        System.out.println("Masukkan jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=sc.nextInt();

        System.out.println("Masukkan Gaji yang dipotong per hari");
        PotGajiPerHr=sc.nextInt();

        TotGaji=(jmlMasuk*GajiPerHr) - (jmlTdkMasuk*PotGajiPerHr);

        System.out.println("Gaji yang Anda terima adalah " +TotGaji); 
        
    }
}
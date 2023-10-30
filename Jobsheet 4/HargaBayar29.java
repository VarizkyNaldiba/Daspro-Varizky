import java.util.Scanner;

public class HargaBayar29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        String merkBuku;
        double total, bayar, jmlDis;
        float Dis;
        System.out.println("Masukkan merk buku yang ingin dibeli ");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Besaran Diskon ");
        Dis=input.nextFloat();

        total=harga*jumlah;
        jmlDis=total*Dis;
        bayar=total-jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
    
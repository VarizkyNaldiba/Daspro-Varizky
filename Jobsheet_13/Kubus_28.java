import java.util.Scanner;

public class Kubus_28 {
    static int hitungLuasPermukaan (int sisi) {
        int Luas=6*sisi*sisi;
        return Luas;
    }
    static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi, Lp, vol;

        System.out.println("Masukkan Panjang Sisi Kubus");
        sisi = sc.nextInt();

        Lp=sisi*sisi*6;
        System.out.println("Luas Permukaan Kubus adalah " + Lp );

        vol=sisi*sisi*sisi;
        System.out.println("Volume Balok adalah " + vol );

    }
}

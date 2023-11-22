import java.util.Scanner;

public class Percobaan6_28 {
    static int hitungLuas (int pjg, int lbr) {
        int Luas=pjg*lbr;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,v,L,vol;

        System.out.println("Masukkan Panjang");
        p=sc.nextInt();
        System.out.println("Masukkan Lebar");
        l=sc.nextInt();
        System.out.println("Masukkan Tinggi");
        t=sc.nextInt();

        L=p*l;
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol=p*l*t;
        System.out.println("Volume Balok adalah " + vol);

    }
}

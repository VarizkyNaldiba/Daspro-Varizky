import java.util.Scanner;

public class UcapanTerimaKasih_28 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.next();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println("Ucapan tambahan: " + tambahan);
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.");

        UcapanTambahan("We Love you <3");
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}

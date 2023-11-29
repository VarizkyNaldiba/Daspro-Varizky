public class Tugas4Rekursif {
    public static int Marmut(int bulan) {
        if (bulan <= 0) {
            return 0;
        } else if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return Marmut(bulan - 1) + Marmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            int jumlahPasangan = Marmut(i);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" + i + ": " + jumlahPasangan);
        }
    }
}
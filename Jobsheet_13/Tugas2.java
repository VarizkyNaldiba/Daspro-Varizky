import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 5;
        int jumlahMinggu = 7;
        double nilaiMahasiswa[][] = new double[jumlahMahasiswa][jumlahMinggu];

        inputNilaiMahasiswa(sc, nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        tampilkanNilaiMahasiswa(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        int hariTertinggi = cariHariNilaiTertinggi(nilaiMahasiswa, jumlahMahasiswa, jumlahMinggu);
        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, hariTertinggi, jumlahMahasiswa);
    }

    public static void inputNilaiMahasiswa(Scanner sc, double nilaiMahasiswa[][], int jumlahMahasiswa, int jumlahMinggu) {
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai mahasiswa " + mahasiswa[i] + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextDouble();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa(double nilaiMahasiswa[][], int jumlahMahasiswa, int jumlahMinggu) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
            }
        }
    }

    public static int cariHariNilaiTertinggi(double nilaiMahasiswa[][], int jumlahMahasiswa, int jumlahMinggu) {
        double maxTotal = 0;
        int hariTertinggi = 0;
        for (int j = 0; j < jumlahMinggu; j++) {
            double totalNilai = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai > maxTotal) {
                maxTotal = totalNilai;
                hariTertinggi = j + 1;
            }
        }
        return hariTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTertinggi(double nilaiMahasiswa[][], int hariTertinggi, int jumlahMahasiswa) {
        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + hariTertinggi + ":");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i][hariTertinggi - 1] == 10) {
                System.out.println("Mahasiswa " + (i + 1) + " (" + "Nama: " + getNamaMahasiswa(i) + ") memiliki nilai sempurna pada minggu ke-" + hariTertinggi + ".");
            }
        }
    }

    public static String getNamaMahasiswa(int index) {
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        return mahasiswa[index];
    }
}

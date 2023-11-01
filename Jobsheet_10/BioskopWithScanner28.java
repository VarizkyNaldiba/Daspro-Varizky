import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        int menu = 0;

        String[][] penonton = new String[4][2];

        while (menu != 3) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu: ");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    do {
                        System.out.println("Masukkan nama : ");
                        nama = sc.nextLine();
                        System.out.println("Masukkan baris : ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom : ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if ((baris > 4) || (kolom > 2) ) {
                            System.out.println("Baris atau kolom tidak mencukupi");
                            break;
                        } 

                        if (penonton [baris - 1] [kolom - 1] != null ) {
                            System.out.println("baris dan kolom sudah terisi. Masukkan kembali baris dan kolom nya");
                            break;
                        } 

                        penonton[baris - 1][kolom - 1] = nama;
                    } while (true);
                    break;

                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + "***");

                        }
                    }
                    break;

                case 3:
                    System.out.println("Anda Keluar dari Menu");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            } 
        }
    }
}

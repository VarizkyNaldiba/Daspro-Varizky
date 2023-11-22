public class Percobaan5_28 {
    public static void Tampil(String atr, int...a) {
    System.out.println("String: " + atr);
    System.out.println("Jumlah argumen/parameter: " + a.length);

    for (int i :a ) {
        System.out.println(i + " ");
    }
        System.out.println();
    }
    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");

    }
}
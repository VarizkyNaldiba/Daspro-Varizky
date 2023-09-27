import java.util.Scanner;

public class PemilihanPercobaan128 {
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        int angka = input29.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " bilangan " + hasil);

    
    }
}
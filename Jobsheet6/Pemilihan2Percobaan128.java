import java.util.Scanner;

public class Pemilihan2Percobaan128 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun  :");
        tahun=input28.nextInt();

        if (( tahun % 4 ) == 0 ) {
            if (( tahun % 100 ) != 0);
                if ( tahun % 400 == 0 )
                System.out.println(" Tahun" + tahun + " Merupakan Tahun Kabisat");
        } else 
                System.out.println(" Tahun" + tahun + "Bukan Tahun Kabisat");
    }  
}
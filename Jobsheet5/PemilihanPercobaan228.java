import java.util.Scanner;

public class PemilihanPercobaan228 {
    public static void main(String[] args) {
        Scanner input29=new Scanner(System.in);

        System.out.println("Nilai UAS       : ");
        float UAS=input29.nextFloat();
        System.out.println("Nilai UTS       : ");
        float UTS=input29.nextFloat();
        System.out.println("Nilai Kuis      : ");
        float Kuis=input29.nextFloat();
        System.out.println("Nilai Tugas     : ");
        float Tugas=input29.nextFloat();

        float Total = (UAS*0.4F) + (UTS*0.3F) + (Kuis*0.1F) + (Tugas*0.2F);
        String Message=Total < 65 ? "Remidi" : " Tidak Remidi ";

        System.out.println("Nilai Akhir = " + Total + " sehingga " + Message );

    }
}
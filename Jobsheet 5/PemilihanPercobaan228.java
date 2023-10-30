import java.util.Scanner;

public class PemilihanPercobaan228 {
    public static void main(String[] args) {
        Scanner input28=new Scanner(System.in);

        System.out.println("Nilai UAS       : ");
        float UAS=input28.nextFloat();
        System.out.println("Nilai UTS       : ");
        float UTS=input28.nextFloat();
        System.out.println("Nilai Kuis      : ");
        float Kuis=input28.nextFloat();
        System.out.println("Nilai Tugas     : ");
        float Tugas=input28.nextFloat();

        float Total = (UAS*0.4F) + (UTS*0.3F) + (Kuis*0.1F) + (Tugas*0.2F);
        System.out.println("Nilai Total anda adalah : " + Total);

        if (Total > 80) {
            System.out.println("Nilai Anda adalah A");
        } else if (Total <= 80) {
            System.out.println("Nilai Anda Adalah B+");
        } else if (Total <= 73) {
            System.out.println("Nilai Anda Adalah B");
        }else if (Total <= 65) {
            System.out.println("Nilai Anda Adalah C+");
        }else if (Total <= 60) {
            System.out.println("Nilai Anda Adalah C");
        }else if (Total <= 50) {
            System.out.println("Nilai Anda Adalah D");
        }else if (Total <= 39) {
            System.out.println("Nilai Anda Adalah E");
        }

    }
}
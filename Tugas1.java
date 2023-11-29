import java.util.Scanner;

public class Tugas1 {
    static int deretDescandingRekusrif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescandingRekusrif(n - 1);
        }       
        return n ;

    }

    static int deretDescandingIteratif(int n) { 
        for (int i = n; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
        return n ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa nilai n? ");
        int bilangan = sc.nextInt();        


        System.out.print(" Iteratif : ");
        deretDescandingIteratif(bilangan);
        System.out.print("\n Rekursif : ");
        deretDescandingRekusrif(bilangan);
    }
}

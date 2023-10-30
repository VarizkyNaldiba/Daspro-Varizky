import java.util.Scanner;

public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input28=new Scanner(System.in);

        int totalSudut, sudut1, sudut2, sudut3;

        System.out.println(" Masukkan sudut 1 : ");
        sudut1=input28.nextInt();
        System.out.println(" Masukkan sudut 2 : ");
        sudut2=input28.nextInt();
        System.out.println(" Masukkan sudut 3 : ");
        sudut3=input28.nextInt();

        totalSudut=sudut1 + sudut2 + sudut3;

        if (totalSudut ==180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1==sudut2) || (sudut2==sudut3)) {
                System.out.println("Segitiga Tersebut Segitga Sama kaki");
            } else if ((sudut1==sudut2) && (sudut2==sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1!=sudut2) && (sudut3!=sudut2) ) {
                System.out.println("Segitiga tersebut adalah segitia Sembarang ");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }        
    } 
}

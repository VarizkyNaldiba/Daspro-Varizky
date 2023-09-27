import java.util.Scanner;

public class PemilihanPercobaan328 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;
        
        System.out.println("Masukkan angka yang pertama: ");
        angka1=input29.nextDouble();
        System.out.println("Masukkan angka yang kedua: ");
        angka2=input29.nextDouble();
        System.out.println("Masukkan operator ( + - * /): ");
        operator=input29.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
                

        }
    }
}
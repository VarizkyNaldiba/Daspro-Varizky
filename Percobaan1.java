public class Percobaan1 {
    static int faktorialRekusrif(int n) {
        if (n == 0) {
            return(1);

        } else{
            return (n * faktorialRekusrif(n - 1));
        }        
    }
    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorialIteratif(5));
        System.out.println(faktorialRekusrif(5));
    }
    
}

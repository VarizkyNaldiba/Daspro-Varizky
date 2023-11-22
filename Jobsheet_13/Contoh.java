public class Contoh {
    public static void main(String[] args) {
        printValues("Hello", 1, 2, 3, "World");
    }

    public static void printValues(Object... values) {
        for (Object value : values) {
            System.out.println(value);
        }
    }
}

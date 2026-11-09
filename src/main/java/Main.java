public class Main {
    public static void main(String[] args) {
        int wysokosc = 5;

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= wysokosc - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
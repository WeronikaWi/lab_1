import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        Scanner scan = new Scanner(System.in);
        double[] tab = new double[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("Podaj %d-ty wyraz tablicy: ", i + 1);
            tab[i] = scan.nextDouble();
        }
        System.out.print("Zawartośc tablicy: ");
        for (double liczba : tab) {
            System.out.print(liczba + " ");
        }

    }
}

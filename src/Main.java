import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int[] tab = {5, 8, 1, 8, 1, 8, 9, 10, -45};

        for (int liczba : tab) {
            System.out.print(liczba + " ");

        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        for (int liczba : tab) {
            System.out.print(liczba + " ");

        }


    }
}

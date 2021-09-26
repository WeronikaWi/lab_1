import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj numer albumu: ");
        int numerIndexu = scan.nextInt();
        System.out.println("Witaj " + imie + " " + nazwisko + " " + numerIndexu);
        System.out.printf("Witaj %s %s %d \n", imie, nazwisko, numerIndexu);



        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int liczbaA, liczbaB;
        System.out.print("Podaj pierwszą liczbę: ");
        liczbaA = scan.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        liczbaB = scan.nextInt();
        System.out.printf("%d + %d = %d\n",liczbaA, liczbaB, liczbaA + liczbaB);
        System.out.printf("%d - %d = %d\n",liczbaA, liczbaB, liczbaA - liczbaB);
        System.out.printf("%d * %d = %d\n",liczbaA, liczbaB, liczbaA * liczbaB);
        System.out.printf("%d / %d = %d\n",liczbaA, liczbaB, liczbaA / liczbaB);
        System.out.printf("%d mod %d = %d\n",liczbaA, liczbaB, liczbaA % liczbaB);


    }
}

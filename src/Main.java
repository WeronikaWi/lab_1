import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 21;
        if(wiek % 3 == 0)
        {
            System.out.println("Podzielny przez 3");
        }
        else
        {
            System.out.println("Niepodzielny przez 3");
        }


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int numerIndeksu = 59937;
        boolean czyParzysty = (numerIndeksu % 2 == 0) ? true : false;
        if(czyParzysty)
            System.out.println("Numer indeksu jest parzysty");
        else
            System.out.println("numer indeksu jest nieparzysty");


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj cenę: ");
        double cena = scan.nextDouble();

        if(cena > 45)
            System.out.println("Kosztuje więcej niż 45 zł. Drogo.");
        else if (cena < 5.50)
            System.out.println("Kosztuje mniej niż 5.50 zł. Pewnie oszustwo.");
        else
            System.out.println("Cena brzmi uczciwie");


    }
}

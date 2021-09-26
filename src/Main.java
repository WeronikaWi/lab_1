import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte malaLiczba;
        malaLiczba = 12;
        short trocheWiekszaLiczba = 220;
        int liczbaCalkowita = -1332;
        long bardzoDuzaLiczba = 35364646;
        float malyUlamek = 4.67f;
        double duzyUlamek = 16.2346724;
        boolean prawdaCzyFalsz = true;
        char znak = 't';
        String wyraz = "cokolwiek";

        System.out.printf("byte: %d\nshort: %d\nint: %d\nlong: %d\n", malaLiczba, trocheWiekszaLiczba, liczbaCalkowita, bardzoDuzaLiczba);
        System.out.printf("float: %f\ndouble: %f\n", malyUlamek, duzyUlamek);
        System.out.printf("boolean: %s\n", prawdaCzyFalsz);
        System.out.printf("znak: %s\nwyraz: %s\n", znak, wyraz);





        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        //a)
        int liczbaA = 30, liczbaB = 4;
        System.out.printf("%d + %d = %d\n", liczbaA, liczbaB, liczbaA + liczbaB);
        System.out.printf("%d - %d = %d\n", liczbaA, liczbaB, liczbaA - liczbaB);
        System.out.printf("%d * %d = %d\n", liczbaA, liczbaB, liczbaA * liczbaB);
        System.out.printf("%d / %d = %d\n", liczbaA, liczbaB, liczbaA / liczbaB);
        System.out.printf("%d mod %d = %d\n", liczbaA, liczbaB, liczbaA % liczbaB);


        double liczbaX = 50.5, liczbaY = 2.5;

        System.out.printf("%f + %f = %f\n", liczbaX, liczbaY, liczbaX + liczbaY);
        System.out.printf("%f - %f = %f\n", liczbaX, liczbaY, liczbaX - liczbaY);
        System.out.printf("%f * %f = %f\n", liczbaX, liczbaY, liczbaX * liczbaY);
        System.out.printf("%f / %f = %f\n", liczbaX, liczbaY, liczbaX / liczbaY);
        System.out.printf("%f mod %f = %f\n", liczbaX, liczbaY, liczbaX % liczbaY);


    }
}

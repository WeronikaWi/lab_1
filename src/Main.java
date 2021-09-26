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
        System.out.print("Liczby całkowite to: ");
        System.out.println(malaLiczba +", " +trocheWiekszaLiczba + ", " + liczbaCalkowita + " i " + bardzoDuzaLiczba);
        System.out.print( "Pozostałe liczby to: ");
        System.out.println(malyUlamek + " i " + duzyUlamek );
        System.out.println("Jest też bool: " + prawdaCzyFalsz);
        System.out.println("I znak: "+znak + " oraz wyraz: " + wyraz);





        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        //a)
        int liczbaA = 30, liczbaB = 4;
        System.out.printf("%d + %d = %d\n",liczbaA, liczbaB, liczbaA + liczbaB);
        System.out.printf("%d - %d = %d\n",liczbaA, liczbaB, liczbaA - liczbaB);
        System.out.printf("%d * %d = %d\n",liczbaA, liczbaB, liczbaA * liczbaB);
        System.out.printf("%d / %d = %d\n",liczbaA, liczbaB, liczbaA / liczbaB);
        System.out.printf("%d mod %d = %d\n",liczbaA, liczbaB, liczbaA % liczbaB);


        double liczbaX = 50.5, liczbaY = 2.5;

        System.out.printf("%f + %f = %f\n", liczbaX, liczbaY, liczbaX + liczbaY);
        System.out.printf("%f - %f = %f\n", liczbaX, liczbaY, liczbaX - liczbaY);
        System.out.printf("%f * %f = %f\n", liczbaX, liczbaY, liczbaX * liczbaY);
        System.out.printf("%f / %f = %f\n", liczbaX, liczbaY, liczbaX / liczbaY);
        System.out.printf("%f mod %f = %f\n", liczbaX, liczbaY, liczbaX % liczbaY);




    }
}

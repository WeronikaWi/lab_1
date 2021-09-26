import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true, b = false, c = true;
        int x = 5, y = 23, z = 18;
        System.out.println("!(a && b) || (a && !c) to: " + (!(a && b) || (a && !c))); //true
        System.out.println(" x > y || z <= z to " + (x > y || z <= z)); //true
        System.out.println(" x == z && z != y to " + (x == z && z != y)); //false
        System.out.println(" x + z == y && x + y != z to " + (x + z == y && x + y != z)); //true
        System.out.println("!(a && b) == (!a || !b) to " + (!(a && b) == (!a || !b))); //true
        System.out.println("!(a && b) == (!a && !b) to " + (!(a && b) == (!a || b))); //false


    }
}

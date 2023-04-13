public class CBBAtividadePratica05 {

    /* Faça um programa que imprima os números pares de 0 a 100. */

    public static void main (String[] arg) {
        int n = 0;
        do {
            if ( n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= 100);
    }
}

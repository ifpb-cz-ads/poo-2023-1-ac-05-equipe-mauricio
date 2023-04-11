import java.util.Scanner;
public class BMExercicio07 {

    /*
    Escreva um programa que, dada uma variável x (com valor 180, por exemplo),
    temos y de acordo com a seguinte regra:

    se x é par, y = x / 2
    se x é impar, y = 3 * x + 1
    imprime y

    O programa deve então jogar o valor de y em x e continuar até que y tenha o
    valor final de 1.

    Por exemplo, para x = 13, a saída será:
    40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
     */

    public static void main (String[] arg) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int x = ler.nextInt();
        int y = 5;

        do {
            if(x % 2 == 0) {
                y = x / 2;
            }
            else {
                y = 3 * x + 1;
            }
            System.out.print(y + " ");
            x = y;
        } while (y != 1);

    }
}

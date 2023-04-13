import java.util.Scanner;
public class BMExercicio06 {

    /* Altere o programa do exercício anterior (Implemente um programa que recebe um número de 1 a 7 e
    imprime o dia da semana correspondente.) para ficar recebendo o número dentro de um laço enquanto
    for diferente de 0 (zero). */

    public static void main (String[] arg) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 7 (Insira 0 para encerrar): ");
        int num = ler.nextInt();

        while (num != 0) {
            switch (num) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                case 3:
                    System.out.println("Terça-Feira");
                    break;
                case 4:
                    System.out.println("Quarta-Feira");
                    break;
                case 5:
                    System.out.println("Quinta-Feira");
                    break;
                case 6:
                    System.out.println("Sexta-Feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                    System.out.println("O numero não é válido!");
            }
            System.out.println("Insira um número de 1 a 7 (Insira 0 para encerrar): ");
            num = ler.nextInt();
        }
        System.out.print("Programa encerrado!");
    }

}

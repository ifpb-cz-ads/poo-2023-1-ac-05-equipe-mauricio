### (Questão 1) Descreva os quatro elementos básicos de repetição controlada por contador.
Os quatro elementos básicos de repetição controlada por contador são: o contador, a condição de término, o corpo do loop e o incremento ou decremento do contador. 
O contador serve para determinar o número de vezes que um loop será executado e ele é inicializado com um valor que será incrementado ou decrementado a cada iteração do loop;
A condição de término é uma expressão lógica que é verificada ao começo de cada iteração, caso seja verdadeira o loop continua sua execução, porém, caso seja falsa, interrompe o loop;
O corpo do loop é onde se encontra instruções que vão ser realizadas a cada iteração do loop;
O incremento ou decremento do contador é a operação que acontece ao fim de cada iteração do loop e atualiza o contador;

### (Questão 2) Compare e contraste as instruções de repetição while e for.
O comando de repetição "for" é utilizado quando o número de repetições das intruções são conhecidas, enquanto o comando "while" é utilizado quando o número de repetição não é conhecido.

### (Questão 3) Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.
A instrução "do...while" executa as intruções do loop pelo menos uma vez de checar as condições de parada, enquato a instrução "while" verifica as condições antes de executar as instruções do loop. A instrução "do...while" é preferível quando o corpo do loop seja executada pelo menos uma vez antes de encerrar, como para receber uma entrada do usuário.

### (Questão 4) Compare e contraste as instruções break e continue.
Ambas instruções são usadas para controlar o fluxo de execução de loops. O comando "break" interrompe a execução daquele loop, enquanto o comando "continue" interrompe a intereção atual do loop e parte para a próxima iteração.

### (Questão 5) Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:

#### a) 

    For (i = 100, i >= 1, i++)
    System.out.println(i);

    For (i = 100, i >= 1, i--)
    System.out.println(i);

#### b) O seguinte código deve imprimir se o inteiro value for par ou ímpar:

    switch (value % 2) {
        case 0:
            System.out.println("Inteiro par");
        case 1:
            System.out.println("Inteiro ímpar");
    }

    switch (value % 2) {
        case 0:
            System.out.println("Inteiro par");
        default:
            System.out.println("Inteiro ímpar");
    }

#### c) O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:

    for(i = 19; i >=1; i +=2) 
    System.out.println(i);

    for(i = 19; i >=1; i -=2) 
    System.out.println(i);

#### d) O código seguinte deve dar saída dos inteiros pares de 2 a 100:

    counter = 2;
    do {
        System.out.println(counter);
        counter += 2;
    } while (counter < 100); 

    counter = 2;
    do {
        System.out.println(counter);
        counter += 2;
    } while (counter <= 100); 

### (Questão 6) O que o seguinte programa faz?

    public class Printing {
        public static void main(String[] args) {
            for(int i=1;i<=10;i++){
                for(int j=1;j<=5;j++){
                    System.out.print('@');
                }

                System.out.println();
            }
        }
    }

O programa imprime o caractere "@" cinco vezes, depois quebra a linha e repete esse processo dez vezes.
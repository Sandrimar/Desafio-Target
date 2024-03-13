import java.util.Scanner;

public class Question2 {
    /*
    Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será
    a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
    programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
    e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int n = sc.nextInt();
        sc.close();
        if (fibonacci(n) || n == 0) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean fibonacci(int num) {
        int a = 0;
        int b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}

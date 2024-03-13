import java.util.Scanner;

public class Question5 {
    /*
    Escreva um programa que inverta os caracteres de um string.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a string a ser invertida: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        char[] a = str.toCharArray();
        int ponteiroMenor = 0;
        int ponteiroMaior = a.length - 1;

        while (ponteiroMenor < ponteiroMaior) {
            char tmp = a[ponteiroMenor];
            a[ponteiroMenor] = a[ponteiroMaior];
            a[ponteiroMaior] = tmp;

            ponteiroMenor++;
            ponteiroMaior--;
        }
        return new String(a);
    }
}

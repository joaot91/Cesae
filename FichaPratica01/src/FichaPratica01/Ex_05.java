package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        double num1, num2, num3, mediaArit, mediaPond;

        // ler num1
        System.out.print("Insira um número: ");
        num1 = input.nextDouble();

        // ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextDouble();

        // ler num3
        System.out.print("Insira um número: ");
        num3 = input.nextDouble();

        // calcular a media aritmetica
        mediaArit = (num1 + num2 + num3)/3;
        System.out.println("Media Aritmetica: " + mediaArit);

        // calcular a media ponderada
        mediaPond = ((num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5));
        System.out.println("Media Ponderada: " + mediaPond);



    }
}

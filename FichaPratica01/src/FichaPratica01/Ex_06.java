package FichaPratica01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner (System.in);

        // Declarar as variaveis
        int valor1, valor2;

        // ler valor1
        System.out.print("Insira o valor1: ");
        valor1 = input.nextInt();

        // ler valor2
        System.out.print("Insira o valor2: ");
        valor2 = input.nextInt();

        System.out.println("Estou a trocar as variaveis...");

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        // Apresentar os valores
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);








    }
}

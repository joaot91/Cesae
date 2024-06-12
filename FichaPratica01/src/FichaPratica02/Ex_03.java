package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //Import de Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double salario, imposto;

        // Ler salario anual
        System.out.print("Insira salario anual: ");
        salario = input.nextDouble();

        if (salario <= 15000) { //Taxa de 20%
            imposto = salario * 0.2;
            System.out.println("Taxa de 20%: " + imposto);
        } else {
            imposto = salario * 0.3;
            System.out.println("Taxa de 30%: " + imposto);
        }
    }
}


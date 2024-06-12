package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        //Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double preco1, preco2, preco3, precoTotal, precoComDesconto;

        //ler preco1
        System.out.print("Isnira o preço1: ");
        preco1 = input.nextDouble();

        //ler preco2
        System.out.print("Isnira o preço2: ");
        preco2 = input.nextDouble();

        //ler preco3
        System.out.print("Isnira o preço3: ");
        preco3 = input.nextDouble();

        // calcular preço total
        precoTotal = preco1 + preco2 + preco3;

        // Aplicar 10% desconto
        precoComDesconto = precoTotal * 0.9;

        // Apresentar o preco com desconto
        System.out.println("PrecoTotal: " + precoTotal);
        System.out.println("Preço com 10% desconto: " + precoComDesconto);


    }
}

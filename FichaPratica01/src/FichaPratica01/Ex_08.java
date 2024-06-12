package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Import de Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int segundosTotais, horas, minutos, segundos;

        // Ler os minutos da musica 1
        System.out.print("Insira os minutos da musica 1: ");
        segundosTotais = (input.nextInt())*60;

        // ler os segundos da musica 1
        System.out.print("Insira os segundos da musica 1: ");
        segundosTotais = segundosTotais + input.nextInt()*60;

        // Ler os minutos da musica 2
        System.out.print("Insira os minutos da musica 2: ");
        segundosTotais = (input.nextInt())*60;

        // ler os segundos da musica 2
        System.out.print("Insira os segundos da musica 2: ");
        segundosTotais = segundosTotais + input.nextInt()*60;

        // Ler os minutos da musica 3
        System.out.print("Insira os minutos da musica 3: ");
        segundosTotais = (input.nextInt())*60;

        // ler os segundos da musica 3
        System.out.print("Insira os segundos da musica 3: ");
        segundosTotais = segundosTotais + input.nextInt()*60;

        // Ler os minutos da musica 4
        System.out.print("Insira os minutos da musica 4: ");
        segundosTotais = (input.nextInt())*60;

        // ler os segundos da musica 4
        System.out.print("Insira os segundos da musica 4: ");
        segundosTotais = segundosTotais + input.nextInt()*60;

        // Ler os minutos da musica 5
        System.out.print("Insira os minutos da musica 5: ");
        segundosTotais = (input.nextInt())*60;

        // ler os segundos da musica 5
        System.out.print("Insira os segundos da musica 5: ");
        segundosTotais = segundosTotais + input.nextInt()*60;


        System.out.println("Segundos Totais do Album: " + segundosTotais);

        // 1h 4m 32s

        horas = segundosTotais/3600;
        minutos = segundosTotais/60 - (horas*60);
        segundos = segundosTotais - (horas*3600) - (minutos*60);

        System.out.println("O Album tem: "+horas+"h" + minutos + "m" + segundos + "s");




    }
}

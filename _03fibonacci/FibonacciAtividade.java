package _03fibonacci;

import java.util.Scanner;

public class FibonacciAtividade {

    public static void main(String[] args) {

        int valor1 = 0, valor2 = 1, valor3 = 0, valordefinal;
        Scanner scam = new Scanner(System.in);

        System.out.println("\n\nDigite um valor que indique até quando ocorrerá a sequência de Finabocci: ");
        valordefinal = scam.nextInt();

        System.out.printf("\n%d, %d, ", valor1, valor2);

        for(int vezes = 2 ; vezes < valordefinal ; vezes++) {

            valor3 = valor1 + valor2;
            System.out.printf("%d, ", valor3);
            valor1 = valor2;
            valor2 = valor3;

            }

            System.out.println("fim.");

        }

}

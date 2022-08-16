package calculadora;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero(0);
        Numero n2 = new Numero(0);
        Numero result = new Numero(0);

        System.out.print("\n\nDigite o valor 1: ");
        n1.setValor(scan.nextInt());

        System.out.print("\nDigite o valor 2: ");
        n2.setValor(scan.nextInt());

        // Resultado
        result.setValor(n1.getValor() + n2.getValor());
        System.out.printf("\n\nA soma entre %d e %d é igual à %d\n", n1.getValor(), n2.getValor(), result.getValor());

    }

}
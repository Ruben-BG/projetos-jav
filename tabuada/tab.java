package tabuada;

import java.util.Scanner;

public class tab {

    public static void main(String[] args) {

        String n1, val = "none", val1 = "S", val2 = "s";
        Scanner scan = new Scanner(System.in);

        while (val != val1 && val != val2) {

            System.out.print("\n\nDigite um valor numérico para fazermos uma tabuada deste: ");
            n1 = scan.nextLine();

            // Analisa se string é, ou não, numérica
            boolean isNumeric = n1.chars().allMatch(Character::isDigit);

            if (isNumeric == true) {

                // Conversão da string para int
                int num = Integer.valueOf(n1);

                // LOOP da tabuada
                for (int contagem = 1; contagem < 11; contagem++) {

                    System.out.printf("\n%d x %d = %d", num, contagem, num * contagem);

                }

            } else {

                System.out.println(
                        "\n\nParece que ocorreu um erro. \nPor favor digite a letra 's' para sair, ou apenas um valor para reiniciar o programa: ");

                val = scan.nextLine();

                if (val.equals(val1) || val.equals(val2)) {

                    System.exit(0);

                }

            }

        }

    }

}

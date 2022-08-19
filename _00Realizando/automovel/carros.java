package automovel;

import java.util.Scanner;

public class carros {

    public static void main(String[] args) {

        Scanner scanear = new Scanner(System.in);
        String digit, ajud = "-h", ajuda = "-help";
        Boolean finalizar = false;

        while (finalizar == false) {

            System.out.print(
                    "\n\nBem vindo ao cadastro de carros!!! \nSe tiver qualquer dúvida digite -h, ou -help. \n\n~>");
            digit = scanear.nextLine();

            if (digit.equals(ajud) || digit.equals(ajuda)) {

                System.out.println("-nome   <~Adicione um novo veículo");
                System.out.println("modelo  <~Use para informar o modelo do veículo criado");
                System.out.println("liga    <~Use para informar se ele liga, ou não liga");

            }

        }

    }

}

package condicoes;

import java.util.Scanner;

public class ScannerCondicoes {
    public static void main(String[] args) {
        /*
        *
        * oejetivo: usar as biblioteca Scanner
        *
        * */

        Scanner CaixaDeTexo = new Scanner(System.in);

        System.out.println("digite o name do seu ninja: ");
        String name = CaixaDeTexo.nextLine();
        System.out.println("o name do ninja e : " + name);


        System.out.println("Digite a Idade do ninja:");
        int Idade = CaixaDeTexo.nextInt();
        System.out.println("A idade do ninja e : " + Idade);

        if (Idade >= 18){
            System.out.println("O ninja e Maior de idade");
        }else {
            System.out.println("O ninja e menor de idade");
        }

        CaixaDeTexo.close();
    }
}

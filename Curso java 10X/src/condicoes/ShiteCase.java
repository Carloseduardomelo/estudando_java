package condicoes;

import java.util.Scanner;

public class ShiteCase {
    public static void main(String[] args) {
        /*
        *
        * Objetivo: estutar shiet case
        *
        * */

        Scanner  opcao = new Scanner(System.in);


        System.out.println("Escolha uma Opição");
        System.out.println("""
                        1 - Naruto
                        2 - sasuke 
                        3 - sakura""");

        int opacaoPersonagen = opcao.nextInt();


        switch (opacaoPersonagen){
            case 1:
                System.out.println("Voce escolheu O naruto");
                break;
            case 2:
                System.out.println("Voce escolheu o sasuke");
                break;
            case 3:
                System.out.println("Voce escolheu a sakura");
                break;

            default:
                System.out.println("Opição invalida, tente novamente");
        }

        opcao.close();
    }
}

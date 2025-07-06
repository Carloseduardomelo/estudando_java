package NivelBasico;
import java.util.Scanner;
public class Deafil02 {
    public static void main(String[] args) {
        Scanner CaixaDeTexto = new Scanner(System.in);
        String[] namesNinja = new String[11];
        int cont = 0;
        while (cont <= 10){
            System.out.println(""" 
                Digite uma das opçõe:
                
                1 - Adicionar um ninja "so pode 10 ninjas"
                2 - Ver os ninjas cadastrados
                3 - sair do programa
                """);
            int opcao = CaixaDeTexto.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o  name do ninja: ");

                    Scanner CaixaNinjaName = new Scanner(System.in);
                    String name = CaixaNinjaName.nextLine();
                    namesNinja[cont] = name;
                    cont++;
                    CaixaNinjaName.close();
                    break;
                case 2:
                    for (int i = 0; i <= 10 ; i++){
                        if (namesNinja[i] == null){
                        }else {
                            System.out.println(namesNinja[i]);
                        }
                    }
                    break;
                case 3:
                    cont = 11;
                    break;
                default:
                    System.out.println("Opção erada escolha outra");
                    break;
            }
        }
        System.out.println(cont == 11 ? "Programa encerado com sucesso" : "Programa inserado por limite de ninjas adicionados.");
        CaixaDeTexto.close();
    }
}
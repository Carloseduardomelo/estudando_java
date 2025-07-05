package NivelBasico;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        /*
        *
        * Trabalhando com laços de repetição.
        *
        * */

        // while

        int numerosDeClones = 0;
        int numeroMaxinoDeClone = 40;

        while (numerosDeClones <= numeroMaxinoDeClone){
            System.out.println("O naruto criou um clone totalizando: " + numerosDeClones);
            numerosDeClones++;
        };


        // FOR - O for e o melhor e mais simple mais claro que tem casos que o while e melhor mais na maioria dos casos o for e melhor

        for (int i = 0 ; i <= numeroMaxinoDeClone; i ++){
            System.out.println("O naruto crio outro clone totalizando: " + i);
        };
    }
}

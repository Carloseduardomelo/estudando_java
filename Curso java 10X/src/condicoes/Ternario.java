package condicoes;

public class Ternario {
    public static void main(String[] args) {
        /*
        * EStudo dos ternarios
        * ternario:  variavel = (condição) ? valorCasoForVerdade : ValorCasoForFalse
        * */

        short numerosDeMisoes = 9;
        String rank = (numerosDeMisoes >=10) ? "Melhor02" : "melhor01";
        System.out.println(rank);

    }
}

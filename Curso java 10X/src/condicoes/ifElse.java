package condicoes;

public class ifElse {
    public static void main(String[] args) {

        /*
        *
        * objetivo: estutar condiçoes: IF e ELSE e ELSE IF
        *
        * */

        String name = "naruto";
        String rank;

        int idade = 18;
        boolean hokage = false;
        short numberMiso = 20;


        if ( numberMiso >= 10  && idade > 18){
            System.out.println("Naruto pode evoluir de rank");
            rank = "melhor";
        }else if (numberMiso >= 20) {
            System.out.println("Naruto pode ir para um nivel melhor do ele estar");
            rank = "melhor2";
        }else {
            System.out.println("Naruto não pode subir de rank, ele e um fracaço");
        }



    }
}

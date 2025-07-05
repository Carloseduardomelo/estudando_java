package TiposDeDados;

public class PrimeiroDesafil {
    public static void main(String[] args) {

        // ninja01
        String ninja01 = "Naruto";
        int ninja01idade = 17;
        String ninja1NameDaMisao = "matar sapo em outra vila inimiga";
        char ninja01Dificuldade = 'C';
        boolean ninja01StatusConclusao = false;

        if ( ninja01idade <= 15 ) {
            if (ninja01Dificuldade == 'C' || ninja01Dificuldade == 'D'){
                ninja01StatusConclusao = true;
            } else {
                ninja01StatusConclusao = false;
            }
        }else{
            ninja01StatusConclusao = true;
        }


        System.out.println("name do ninja01: " + ninja01);
        System.out.println("idade do ninja01: " + ninja01idade);
        System.out.println("nome da misão ninja01: " + ninja1NameDaMisao);
        System.out.println("A dificuldade e: " + ninja01Dificuldade);
        System.out.println("status de conclusão: " + ninja01StatusConclusao);

        System.out.println("_______________________________________________________________________________");

        String ninja02 = "Sasuke";
        int ninja02idade = 16;
        String ninja02NameDaMisao = "matar o proprio irmão em outro tempo";
        char ninja02Dificuldade = 'S';
        boolean ninja02StatusConclusao = false;

        if ( ninja02idade <= 15 ) {
            if (ninja02Dificuldade == 'C' || ninja02Dificuldade == 'D'){
                ninja02StatusConclusao = true;
            } else {
                ninja02StatusConclusao = false;
            }
        }else{
            ninja02StatusConclusao = true;
        }

        System.out.println("name do ninja01: " + ninja02);
        System.out.println("idade do ninja01: " + ninja02idade);
        System.out.println("nome da misão ninja01: " + ninja02NameDaMisao);
        System.out.println("A dificuldade e: " + ninja02Dificuldade);
        System.out.println("status de conclusão: " + ninja02StatusConclusao);

        System.out.println("_______________________________________________________________________________");

        String ninja03 = "Boruto ";
        int ninja03idade = 10;
        String ninja03NameDaMisao = "Soltar no tempo para ver como seu pai sofreu";
        char ninja03Dificuldade = 'S';
        boolean ninja03StatusConclusao = false;

        if ( ninja03idade <= 15 ) {
            if (ninja03Dificuldade == 'C' || ninja03Dificuldade == 'D'){
                ninja03StatusConclusao = true;
            } else {
                ninja03StatusConclusao = false;
            }
        }else{
            ninja03StatusConclusao = true;
        }

        System.out.println("name do ninja01: " + ninja03);
        System.out.println("idade do ninja01: " + ninja03idade);
        System.out.println("nome da misão ninja01: " + ninja03NameDaMisao);
        System.out.println("A dificuldade e: " + ninja03Dificuldade);
        System.out.println("status de conclusão: " + ninja03StatusConclusao);

    }
}

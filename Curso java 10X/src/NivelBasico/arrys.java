package NivelBasico;

public class arrys {
    public static void main(String[] args) {
        /*
        * Objetivo estudar os arrys e como eles funciona.
        * */

        String[] namesNinja = new String[3]; // podemos faazer um qualquer tipo.

        namesNinja[0] = "Naruto";
        namesNinja[1] = "Sasuke";
        namesNinja[2] = "Hinata";

        //System.out.println(namesNinja[0]);


        // Usando o For para percorrer uma arrys

        for ( int i = 0 ; i < 3; i++){
            System.out.println(namesNinja[i]);
        }

    }
}

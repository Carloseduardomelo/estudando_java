package NivelBasico;

public class arrys2D {
    public static void main(String[] args) {

        /*
        * Obejetivo: estudar arrys como si fosse uma matrix.
        *
        * [0][0]  [0][1]   [0][2]
        * conora \ Naruto \ Sasuke
        * [1][0]  [1][1]   [1][2]
        * Nevua  \ zabuza \ Nesuku
        * [2][0]  [2][1]    [2][2]
        * Deverto\ Gaara  \ Temari
        *
        * Ele ficou como uma matrix
        * */


        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "conora";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevua";
        ninjasEAldeias[1][1] = "zabuza";
        ninjasEAldeias[1][2] = "Nesuku";

        ninjasEAldeias[2][0] = "Deverto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++){
            System.out.println("Aldeia:" + ninjasEAldeias[i][0] + " Ninja01: " + ninjasEAldeias[i][1] + " Ninja02: " + ninjasEAldeias[i][2]);
        }

    }
}

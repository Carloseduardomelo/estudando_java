package list;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //Arrys
        // Eles são estaticos, e não dar para mecher lenes
        String[] ninjasArrys = new String[3];
        ninjasArrys[0] = "naruto";
        ninjasArrys[1] = "sasuque";
        ninjasArrys[2] = "sakura";
        System.out.println("montrando a referencia de menoria do Arry = " + ninjasArrys);

        //List
        List<Integer> ninjasList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ninjasList.add(i);
        }
        System.out.println(ninjasList);


    }
}

package queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
        public static void main(String[] args) {
            Queue<String> filaLoterica = new LinkedList<>();

            // As Queu e o stack envertido .

            //Adicionar item na Queue
            filaLoterica.add("ninja01");

            // Tirando um primeiro elememtos
            filaLoterica.poll();

            // Vendo tem estar na cabeçã
            filaLoterica.peek();
    }
}

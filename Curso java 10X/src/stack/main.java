package stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {

        // Stack e uma piçha como um historico de navegador.

        // Creação do stack.
        Stack<String> historico = new Stack<String>();
        historico.add("ola munsdo01");

        // Metodo para adicionar novo items na stack.
        historico.push("ola mundo02");

        // Remover um item no topo.
        historico.pop();

        // Para ver qual items estar no topo.
        historico.peek();

        // Para ver o tamanho da stack
        historico.size();
        System.out.println(historico);

        // Para limpar a stack.
        historico.clear();
        System.out.println(historico);


    }
}

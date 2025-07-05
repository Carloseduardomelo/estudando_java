package TiposDeDados;

import java.util.Locale;

public class DdosNaoPrimitivos {
    public static void main(String[] args) {

        // dados não primitivos]

        String name = "naruto";
        name = name.toUpperCase(Locale.ROOT);
        System.out.println("o name em toUpperCase: " + name);

        String aldeia = "ALDEIA DA FOLHA";
        aldeia = aldeia.toLowerCase(Locale.ROOT);
        System.out.println("o name em toLowerCase: " + aldeia);


    }
}

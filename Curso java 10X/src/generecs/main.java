package generecs;

public class main {
    public static void main(String[] args) {

        bolsaNinja<Object> bolsaNinja = new bolsaNinja<>();

        bolsaNinja.adicionarItems(new kunai(2));
        bolsaNinja.mostrarItems();

        for (int i = 0; i < 10; i++) {
            bolsaNinja.adicionarItems(new kunai(i * 2));
        }

        bolsaNinja.mostrarItems();

    }
}

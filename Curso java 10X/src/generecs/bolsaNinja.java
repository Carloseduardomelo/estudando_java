package generecs;

import java.util.ArrayList;
import java.util.List;

public class bolsaNinja<T> {
    private List<T> items;

    public bolsaNinja(){
        this.items = new ArrayList<>();
    }

    public void adicionarItems (T item) {
        items.add(item);
    }
    public void mostrarItems () {
        for (T ferramenta : items){
            System.out.println(ferramenta);
        }
    }

}

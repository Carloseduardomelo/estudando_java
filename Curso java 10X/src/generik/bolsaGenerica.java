package generik;

import java.util.ArrayList;
import java.util.List;

public class bolsaGenerica <T>{

    private List<T> equipamentos;

    public bolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    // função para adicionar equipamento

    public void adicionarEquipamento (T equipamento) {
        equipamentos.add(equipamento);
    };

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }
    @Override
    public String toString() {
        return "Bolsa generica: " + equipamentos.toString();
    }
}

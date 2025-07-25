package generik;

public class main {
    public static void main(String[] args) {

        equipamentosNinja kunai = new equipamentosNinja("Kunai");

        bolsaGenerica<equipamentosNinja> Bolsagenerica = new bolsaGenerica<>();
        Bolsagenerica.adicionarEquipamento(kunai);
        System.out.println(Bolsagenerica);

    }
}

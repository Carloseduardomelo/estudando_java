package NivelINtermetiario;

public class Ninja {
    String Name;
    String Aldeia;
    int Idade;

    // o Void ele não retorna nada, ja os outro retornam alguma coisa.

    public void CharinganAtividado (){
        System.out.println("o Charingan foi ativado");
    }

    public String EuSouUmNinja() {
        return  "Ola eu sou um ninja"; //sempre temos que colocar esse palavra para retorna alguam cois.
    }

    public int QuantoTempoFaltaParaSerHocage (int Idademinina){
        return Idademinina - Idade;
    }


}

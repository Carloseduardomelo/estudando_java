package herancaMultipla;

public class ninja {

    String name;
    String aldeia;
    int idade;

    public ninja (String name, String aldeia, int idade) {
        this.name = name;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void OlaSouUmNinja () {
        System.out.println("Eu vou um ninja da aldeia " + aldeia + "e min chamo " + name);
    }
}

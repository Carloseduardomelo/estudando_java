package finalTudo;

public abstract class ninja {

    String name;
    String aldeia;
    int idade;
    final String rank = "01";

    public ninja (String name, String aldeia, int idade){
        this.name = name;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    final void olaEuSouUmNinja () {
        System.out.println("ola e sou um ninja da aldeia da " + aldeia + " e meu nome e " + name);
    }
}

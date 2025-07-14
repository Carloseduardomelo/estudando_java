package classAbstratsXinterfaces;

public abstract class ninja {

    String name;
    int idade;

    public ninja (String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    public void Falar (){
        System.out.println("ola eu sou um ninja");
    }

    public abstract void falar02();
}

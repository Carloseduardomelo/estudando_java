package herancaMultipla;

public class Uchira extends ninja implements Sharinganinterfece{

    public Uchira (String name,  String aldeia, int idade){
        super(name,aldeia,idade);
    }

    @Override
    public void SharinganAtivado (){
        System.out.println("Sharingan ativado com sucesso");
    }
}

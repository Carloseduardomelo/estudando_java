package herancaMultipla;

public class Hatake extends ninja implements Sharinganinterfece, Anbuinterfece, Hokageintefece{

    public Hatake (String name, String aldeia, int idade){
        super(name, aldeia, idade);
    }

    @Override
    public void SharinganAtivado (){
        System.out.println("Meu Sharingan estar ativado");
    }

    @Override
    public void NinjaDeElite () {
        System.out.println("Eu sou da Anbu");
    }

    @Override
    public void SouHokage (){
        System.out.println("Sou um hokage");
    }



}

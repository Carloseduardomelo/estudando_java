package poliforfismoEabstrate;

public abstract class ninja implements atackEspecial {
    String name;
    int idade;
    String aldeias;

    public  ninja (String name,int idade, String aldeias){
        this.name = name;
        this.idade = idade;
        this.aldeias = aldeias;
    }

    public void olaEuSouUmninja () {
        System.out.println("ola e suo um ninja da aldeia: " + aldeias);
    }

    @Override
    public void atackEspecialninja () {
        System.out.println("meu nome e: " + name + "e esse e meu atack especial");
    }
    @Override
    public  void atackNormal () {
        System.out.println("meu nome e: " + name + "e eu uso tambem os atacks normais");
    }
    @Override
    public void possoSerHokage (int idadeMinima) {
        System.out.println(idadeMinima >= idade ? "Voce não pode ser hokage" : "Voce estar apito a ser Hokage");
    }

}

package enpacsulamento;

public abstract class minja {

    private String name;
    private String aldeia;
    private int idade;

    public minja(String name, String aldeia, int idade){
        this.name = name;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    public String getName () {
        return  name;
    }
    public String getAldeia(){
        return aldeia;
    }
    public int getIdade(){
        return  idade;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}

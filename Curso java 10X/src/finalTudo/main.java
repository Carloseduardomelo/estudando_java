package finalTudo;

public class main {
    public static void main(String[] args) {

        //Podemos criar metodos final nas interfeces.

        System.out.println("__________________________");
        uzumaki naruto = new uzumaki("naruto" , "folha" , 17);
        naruto.olaEuSouUmNinja();
        //naruto.rank = "09", nao podemos reatribuir um atributo final.
    }
}

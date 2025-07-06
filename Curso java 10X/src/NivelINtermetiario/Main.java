package NivelINtermetiario;

public class Main {
    public static void main(String[] args) {

        /*
        * Tudo em java e um objeto
        * */

        //criando um ninja naruto com umas class. Podemos criar varios ninjas usando a class ninja.
        Uzumaki Naruto = new Uzumaki();
        Naruto.Name = "Naruto";
        Naruto.Idade = 19;
        Naruto.Aldeia = "Aldeia da folha";
        Naruto.AtivacaoDoModoSabio();

        // criando sasuke
        Uchira sasuke = new Uchira();
        sasuke.Name = "Sasuke";
        sasuke.Idade = 18;
        sasuke.Aldeia = "folha";
        sasuke.CharinganAtividado();

    }
}

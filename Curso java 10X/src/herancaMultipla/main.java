package herancaMultipla;

public class main {
    public static void main(String[] args) {

        Hatake kakashi = new Hatake("kakashi" , "folha" , 45);
        kakashi.NinjaDeElite();
        kakashi.SharinganAtivado();
        kakashi.OlaSouUmNinja();
        kakashi.SouHokage();

        System.out.println("_______________________________________________________________________");

        Uchira sasuke = new Uchira("sasuke", "folha" , 20);
        sasuke.SharinganAtivado();
        sasuke.OlaSouUmNinja();

    }
}

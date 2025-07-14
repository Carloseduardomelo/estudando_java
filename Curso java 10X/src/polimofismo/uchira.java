package polimofismo;

public class uchira extends minja{

    public void sharinganAtivado () {
        System.out.println("meu sharingan Ativou");
    }

    @Override // sobreescrevendo metodo com o Override
    public void atackespecial () {
        System.out.println("ola e sou " + Name + "e esse e meu atack especial de fogo.");
    }

}

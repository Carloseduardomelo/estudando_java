package Desafil03;

public class Main {
    public static void main(String[] args) {

        //criar um ninja

        Uchira sasuke = new Uchira();

        sasuke.name = "sasuke";
        sasuke.idade = 18;
        sasuke.abilidadeEspecial = "charingan";
        sasuke.missao = "matar seu proprio irmão";
        sasuke.statusDaMisao = "Concluido";
        sasuke.MostrarInformacoes();
        sasuke.mostrarAbilidadeEspecial();
    }
}

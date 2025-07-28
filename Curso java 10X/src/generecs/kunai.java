package generecs;

public class kunai {
    private int tamanho;

    public kunai(int tamalho) {
        this.tamanho = tamalho;
    }

    public int getTamalho() {
        return tamanho;
    }
    @Override
    public String toString(){
        return "o tamanho da kunai e : " + tamanho;
    }
}

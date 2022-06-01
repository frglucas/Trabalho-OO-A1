package ex2;

public class Elevador {

    private int andarAtual;
    private int andarMax;
    private int capacidade;
    private int qtdAtual;

    public Elevador(int andarMax, int capacidade) {
        this.andarAtual = 0;
        this.andarMax = andarMax;
        this.capacidade = capacidade;
        this.qtdAtual = 0;
    }

    public void entra(){
        if(qtdAtual < capacidade){
            qtdAtual++;
        } else System.out.println("O elevador está na sua lotação máxima!");
    }

    public void sai(){
        if(qtdAtual > 0){
            qtdAtual--;
        } else System.out.println("O elevador está vazio!");
    }

    public void sobe(){
        if(andarAtual < andarMax){
            andarAtual++;
        } else System.out.println("O elevador está no último andar!");
    }

    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
        } else System.out.println("O elevador não consegue descer mais!");
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarMax() {
        return andarMax;
    }

    public void setAndarMax(int andarMax) {
        this.andarMax = andarMax;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}

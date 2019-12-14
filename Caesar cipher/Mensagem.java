
package cifra;

public class Mensagem {
    private char letra1;
    private char letra2;
    private Mensagem anterior;
    private Mensagem proximo;   

    public Mensagem(char letra1, char letra2) {
        this.letra1 = letra1;
        this.letra2 = letra2;
        this.anterior = null;
        this.proximo = null;
    }

    public char getLetra1() {
        return letra1;
    }

    public void setLetra1(char letra1) {
        this.letra1 = letra1;
    }

    public char getLetra2() {
        return letra2;
    }

    public void setLetra2(char letra2) {
        this.letra2 = letra2;
    }

    public Mensagem getAnterior() {
        return anterior;
    }

    public void setAnterior(Mensagem anterior) {
        this.anterior = anterior;
    }

    public Mensagem getProximo() {
        return proximo;
    }

    public void setProximo(Mensagem proximo) {
        this.proximo = proximo;
    }
}

package digitalautenticator;

public class No {
    private String line;
    private int altura;
    private No esquerdo;
    private No direito;

    public No(String line) {
        this.line = line;
        this.altura = 1;
        this.esquerdo = null;
        this.direito = null;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
}
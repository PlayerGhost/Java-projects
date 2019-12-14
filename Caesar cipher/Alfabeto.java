
package cifra;

public class Alfabeto {
    private char letra;
    private Alfabeto proximo;
    private Alfabeto anterior;

    public Alfabeto(char letra) {
        this.letra = letra;
        this.proximo = null;
        this.anterior = null;
    } 

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Alfabeto getProximo() {
        return proximo;
    }

    public void setProximo(Alfabeto proximo) {
        this.proximo = proximo;
    }

    public Alfabeto getAnterior() {
        return anterior;
    }

    public void setAnterior(Alfabeto anterior) {
        this.anterior = anterior;
    }
}

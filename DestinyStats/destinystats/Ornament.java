
package destinystats;

import java.io.Serializable;

public class Ornament implements Serializable{
    private String nome;
    private String nomeDoItem;

    public Ornament(String nome, String nomeDoItem) {
        this.nome = nome;
        this.nomeDoItem = nomeDoItem;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


package destinystats;

import java.io.Serializable;

public abstract class Gear implements Serializable{
    private String nome;
    private String description;

    public Gear(String nome, String description) {
        this.nome = nome;
        this.description = description;
    }
    
    public abstract void mod(int statsToIncremment);
    public abstract void mod(int statsToIncremment, double porcentagem);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

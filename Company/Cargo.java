
package empresa;

public class Cargo {
    private String nome;
    private float salario;
    private String id;

    public Cargo(String nome, float salario, String id) {
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

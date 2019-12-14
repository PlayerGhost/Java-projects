
package empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private String email;
    private String date;
    private Cargo cargo;

    public Funcionario(String nome, String cpf, String email, String date, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.date = date;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}

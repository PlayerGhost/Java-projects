
package empresa;

import java.util.ArrayList;

public class Setor {
    private ArrayList<Funcionario> funcionarios;
    private String nome;
    private int quantidade;

    public Setor() {
    }

    public Setor(ArrayList<Funcionario> funcionarios, String nome, int quantidade) {
        this.funcionarios = funcionarios;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

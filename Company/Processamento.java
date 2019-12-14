
package empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Processamento {
    ArrayList<Cargo> cargos = new ArrayList<Cargo>();
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    ArrayList<Setor> setores = new ArrayList<Setor>();
    private Scanner input = new Scanner(System.in);
    private int aux = 1;
    private Cargo aux1;
    private Funcionario aux2;
    private Setor aux3;
    
    public void userChoice(){
        
        while (aux != 0){
            System.out.println(" ");
            System.out.println("Escolha sua operação:");
            System.out.println("1 - Cadastrar cargo.");
            System.out.println("2 - Cadastrar funcionário.");
            System.out.println("3 - Excluir cargo.");
            System.out.println("4 - Excluir funcionário.");
            System.out.println("5 - Listar cargos.");
            System.out.println("6 - Listar funcionários.");
            System.out.println("7 - Editar cargo.");
            System.out.println("8 - Editar funcionário.");
            System.out.println("9 - Criar setor.");
            System.out.println("10 - Excluir setor.");
            System.out.println("11 - Listar setores.");
            System.out.println("12 - Listar todos os funcionários de um setor.");
            System.out.println("13 - Adicionar um funcionário a um setor.");
            System.out.println("14 - Total da folha salarial de um setor.");
            System.out.println("15 - Total da folha salarial da empresa.");
            System.out.println("0 - SAIR");
            aux = input.nextInt();
            input.nextLine();
            
             
            switch (aux) {            
                case 1:
                    adicionarCargo();
                    break;
                case 2:
                    adicionarFuncionario();
                    break;
                case 3:
                    System.out.println("Informe o id do cargo que você deseja remover");
                    excluirCargo(input.next());
                    break;
                case 4:
                    System.out.println("Informe o CPF do funcionario que você deseja excluir.");
                    excluirFuncionario(input.next());
                    break;
                case 5:
                    listarCargos();
                    break;
                case 6:
                    listarFuncionarios(funcionarios);
                    break;
                case 7:
                    editarCargo();
                    break;
                case 8:
                    editarFuncionario();
                    break;
                case 9:
                    criarSetor();
                    break;
                case 10:
                    excluirSetor();
                    break;
                case 11:
                    listarSetores();
                    break;
                case 12:
                    listarFuncSet();
                    break;
                case 13:
                    addFuncSet();
                    break;
                case 14:
                    System.out.println("Informe o nome do setor que você deseja saber o total da folha salarial."); 
                    String nome = input.nextLine();
                    
                    System.out.println(" ");
                    System.out.println("Setor: " + nome);
                    System.out.println("Folha salarial: R$ " + toltalFolhaSetor(nome));
                    break;
                case 15:
                    toltalFolhaEmpresa();
                    break;
            }
        }
    }
    
    public Cargo adicionarCargo(){
        System.out.println("Digite o nome do cargo.");
        String nome = input.nextLine();

        System.out.println("Digite o salário do cargo.");
        float salario = input.nextFloat();
        
        System.out.println("Digite o ID do cargo.");
        String id = input.next();
        
        Cargo novo = new Cargo(nome, salario, id);                    
        cargos.add(novo);
        System.out.println("CARGO CADASTRADO COM SUCESSO!");
        
        return novo;
    }
    
    public void excluirCargo(String id){   
        for (int i = 0; i < cargos.size(); i++){
            aux1 = cargos.get(i);
            
            if (id.equals(aux1.getId())){
                cargos.remove(i);
            }
        }
        
        System.out.println(" ");
        System.out.println("CARGO EXCLUIDO COM SUCESSO!");
    }
    
    public void listarCargos(){
        if(cargos.size() == 0){
            System.out.println(" ");
            System.out.println("NÃO A CARGOS CADASTRADOS!");
        }else{
            for (int i = 0; i < cargos.size(); i++){
                aux1 = cargos.get(i);
                System.out.println(" ");
                System.out.println("Cargo " + (i+1));
                System.out.println("Nome do cargo: " + aux1.getNome());
                System.out.println("Salario: " + aux1.getSalario());
                System.out.println("ID: " + aux1.getId());
            }
        }    
    }
    
    public void editarCargo(){
        System.out.println("Informe o id do cargo que você deseja edtar.");
        String id = input.next();
        int cont = 0;
        int x = 0;
        
        for (int i = 0; i < cargos.size(); i++){
            aux1 = cargos.get(i);
            
            if (id.equals(aux1.getId())){
                x = i;
                cont++; 
            }
        }
        
        if(cont == 0){
            System.out.println("ESSE CARGO NÃO EXISTE!");
        }else{
            System.out.println("Qual informação deseja editar? (1 - Nome, 2 - Salario, 3 - ID)");
            int temp = input.nextInt();
        
            switch (temp) {            
                case 1:
                    System.out.println("Informe o novo nome.");
                    input.nextLine();
                    aux1.setNome(input.nextLine());
                    cargos.set(x, aux1);
                    System.out.println("NOME EDITADO COM SUCESSO!");
                    break;
                case 2:
                    System.out.println("Informe o novo salario.");
                    aux1.setSalario(input.nextInt());
                    cargos.set(x, aux1);
                    System.out.println("SALÁRIO EDITADO COM SUCESSO!");
                    break;
                case 3:
                    System.out.println("Informe o novo ID.");
                    aux1.setId(input.next());
                    cargos.set(x, aux1);
                    System.out.println("ID EDITADO COM SUCESSO!");
                    break;
            }       
        }
    }
    
    public Funcionario adicionarFuncionario(){
        Cargo cargo = null;
        int cont = 0;
        
        
        System.out.println("Digite o nome do funcionário."); 
        String nome = input.nextLine();
      
        System.out.println("Digite o CPF do funcionário.");
        String cpf = input.next();
        
        System.out.println("Digite o EMAIL do funcionário.");
        String email = input.next();
        
        System.out.println("Digite a data de nascimento do funcionário no formato (DD/MM/AAAA).");
        String date = input.next();
        
        while(cont == 0){
            System.out.println(" ");
            System.out.println("Informe o ID do cargo do funcionario.");
            String id = input.next();
        
            for (int i = 0; i < cargos.size(); i++) {
                aux1 = cargos.get(i);

                if(id.equals(aux1.getId())) {
                    cargo = aux1; 
                    cont++;
                }
            }
            
            if(cont == 0){
                System.out.println("ESSE CARGO NÃO EXISTE!");
            }
        }    
        
        Funcionario funcionario = new Funcionario(nome, cpf, email, date, cargo);
        funcionarios.add(funcionario);
        
        System.out.println("FUNCIONÁRIO CADASTRADO COM SUCESSO!");
        
        return funcionario;
    }
    
    public void excluirFuncionario(String cpf) {
        for(int i = 0; i < funcionarios.size(); i++){
            aux2 = funcionarios.get(i);
            
            if(cpf.equals(aux2.getCpf())){
                funcionarios.remove(i);
                System.out.println("FUNCIONÁRIO REMOVIDO COM SUCESSO!");
            }
        }
    }
    
    public void listarFuncionarios(ArrayList<Funcionario> temp){
        if(funcionarios.size() == 0){
            System.out.println("NÃO A FUNCIONÁRIOS!");
        }else{
            for(int i = 0; i < temp.size(); i++){
                aux2 = temp.get(i);
                aux1 = aux2.getCargo();
                
                System.out.println(" ");
                System.out.println("Funcionário " + (i+1));
                System.out.println("Nome: " + aux2.getNome());
                System.out.println("CPF: " + aux2.getCpf());
                System.out.println("Email: " + aux2.getEmail());
                System.out.println("Data de nascimaneto: " + aux2.getDate());
                System.out.println(" ");
                
                System.out.println("Nome do cargo: " + aux1.getNome());
                System.out.println("Salario: " + aux1.getSalario());
                System.out.println("ID: " + aux1.getId());
            }
        }
    }
    
    public void editarFuncionario(){
        System.out.println("Informe o CPF do funcionario que você deseja editar.");
        String cpf = input.next();
        int cont = 0;
        int cont2 = 0;
        
        for(int i = 0; i < funcionarios.size(); i++){
            aux2 = funcionarios.get(i);
            
            if (cpf.equals(aux2.getCpf())){
                System.out.println("Qual informação do funcionário você deseja editar?");
                System.out.println("1 - Nome");
                System.out.println("2 - CPF");
                System.out.println("3 - Email");
                System.out.println("4 - Data de nascimaneto");
                System.out.println("5 - Cargo");
                int temp = input.nextInt();
                cont++;
                
                switch (temp) {            
                    case 1:
                        System.out.println("Informe o novo nome.");
                        input.nextLine();
                        aux2.setNome(input.nextLine());
                        
                        funcionarios.set(i, aux2);
                        System.out.println("NOME EDITADO COM SUCESSO!");
                        break;
                    case 2:
                        System.out.println("Informe o novo CPF.");
                        aux2.setCpf(input.next());
                        
                        funcionarios.set(i, aux2);
                        System.out.println("CPF EDITADO COM SUCESSO!");
                        break;
                    case 3:
                        System.out.println("Informe o novo Email.");
                        aux2.setEmail(input.next());
                        
                        funcionarios.set(i, aux2);
                        System.out.println("EMAIL EDITADO COM SUCESSO!");
                        break;
                    case 4:
                        System.out.println("Informe a nova data de nascimaneto.");
                        aux2.setDate(input.next());
                        
                        funcionarios.set(i, aux2);
                        System.out.println("DATA DE NASCIMANETO EDITADA COM SUCESSO!");
                        break;
                    case 5:
                        while(cont2 == 0){
                            System.out.println("Informe o ID do novo cargo.");
                            String id = input.next();

                            for (int x = 0; x < cargos.size(); x++){
                                aux1 = cargos.get(x);

                                if (id.equals(aux1.getId())){
                                    aux2.setCargo(aux1);
                                    cont2++;
                                    
                                    funcionarios.set(i, aux2);
                                    System.out.println("CARGO EDITADO COM SUCESSO!");
                                }
                            }
                            
                            if(cont2 == 0){
                                System.out.println("ESSE CARGO NÃO EXISTE!");
                            }
                        }
                        break;
                }
            }
        }
        
        if(cont == 0){
            System.out.println("ESSE FUNCIONÁRIO NÃO EXISTE!");
        }
    }
    
    public void criarSetor(){
        ArrayList<Funcionario> temp = new ArrayList<Funcionario>();
        Funcionario funcionario;
        int choice = 0;
        int cont = 0;
        
        System.out.println("Informe o nome do setor.");
        String nome = input.nextLine();
        
        while(choice != 3){
            System.out.println("1 - Criar um novo funcionario para o setor, 2 - Adicionar um funcionario existente ao setor, 3 - Continuar");
            choice = input.nextInt();
            input.nextLine();
            
            if (choice == 1){
                funcionario = adicionarFuncionario();
                temp.add(funcionario);
            }else if (choice == 2){
                System.out.println("Informe o CPF do funcionário que você deseja adicionar ao setor(Somente números).");
                String cpf = input.next();
                
                for (int i = 0; i < funcionarios.size(); i++) {
                    funcionario = funcionarios.get(i);
                    
                    if(cpf.equals(funcionario.getCpf())){
                        temp.add(funcionario);
                        cont++;
                    }
                }
                
                if (cont == 0){
                    System.out.println("Esse funcionário não existe.");
                }        
            }
        }
        
        Setor novo = new Setor(temp, nome, temp.size());                    
        setores.add(novo);
        System.out.println("SETOR CRIADO COM SUCESSO!");
    }
    
    public void excluirSetor(){
        System.out.println("Informe o nome do setor que você deseja excluir.");
        String nome = input.nextLine();
        
        for (int i = 0; i < setores.size(); i++){
            aux3 = setores.get(i);
            
            if (nome.equals(aux3.getNome())){
                setores.remove(i);
                System.out.println("SETOR EXCLUIDO COM SUCESSO!");
            }
        }
    }
    
    public void listarSetores(){
        if(setores.size() == 0){
            System.out.println(" ");
            System.out.println("NÃO A SETORES CRIADOS!");
        }else{
            for (int i = 0; i < setores.size(); i++){
                aux3 = setores.get(i);
                System.out.println(" ");
                System.out.println("Setor " + aux3.getNome());
                System.out.println("Funcionários: " + aux3.getQuantidade());
            }
        }    
    }
    
    public void listarFuncSet(){
        System.out.println("Informe o nome do setor");
        String nome = input.nextLine();
        
        
        for (int i = 0; i < setores.size(); i++){
            aux3 = setores.get(i);
            
            if (nome.equals(aux3.getNome())){
                listarFuncionarios(aux3.getFuncionarios());
            }
        }
    }
    
    public void addFuncSet(){
        ArrayList<Funcionario> temp = null;
        Funcionario funcionario;
        int cont = 0;
        
        System.out.println("Informe o nome do setor");
        String nome = input.nextLine();
         
        
        for (int i = 0; i < setores.size(); i++){
            aux3 = setores.get(i);
            
            if (nome.equals(aux3.getNome())){
                temp = aux3.getFuncionarios();
                
                System.out.println("1 - Criar um novo funcionario para o setor, 2 - Adicionar um funcionario existente ao setor");
                int choice = input.nextInt();
                input.nextLine();

                if (choice == 1){
                    funcionario = adicionarFuncionario();
                    temp.add(funcionario);
                    
                }else if (choice == 2){
                    System.out.println("Informe o CPF do funcionário que você deseja adicionar ao setor(Somente números).");
                    String cpf = input.next();

                    for (int x = 0; x < funcionarios.size(); x++) {
                        funcionario = funcionarios.get(x);

                        if(cpf.equals(funcionario.getCpf())){
                            temp.add(funcionario);
                            cont++;
                        }else if (cont == 0){
                            System.out.println("Esse funcionário não existe.");
                        }
                    } 
                }
            }
            aux3.setFuncionarios(temp);
            aux3.setQuantidade(temp.size());
            setores.set(i, aux3);       
        }
    }
    
    public float toltalFolhaSetor(String nome){
        ArrayList<Funcionario> temp = null;
        float total = 0;
        int cont = 0;
 
        for (int i = 0; i < setores.size(); i++){
            aux3 = setores.get(i);
            
            if (nome.equals(aux3.getNome())){
                temp = aux3.getFuncionarios();
                cont++;
            }
        }
        
        if(cont == 0){
            System.out.println("ESSE SETOR NÃO EXISTE!");
        }else{
            for (int i = 0; i < temp.size(); i++){
                aux2 = temp.get(i);
                aux1 = aux2.getCargo();
                total += aux1.getSalario();
            }
        }

        return total;
    }
    
    public void toltalFolhaEmpresa(){
        float total = 0;
        
        for (int i = 0; i < setores.size(); i++){
            aux3 = setores.get(i);
            total += toltalFolhaSetor(aux3.getNome());
        }
        
        System.out.println("Folha salarial da empresa: R$" + total);
    }
}

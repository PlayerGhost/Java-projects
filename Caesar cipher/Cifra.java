
package cifra;

import java.util.Scanner;

public class Cifra {

    public static void main(String[] args) {
        Encriptador cifra = new Encriptador();
        Scanner input = new Scanner(System.in);
        int aux;
        
        System.out.println("Escolha sua operação (1 - encriptação, 2 - decriptação)");
        aux = input.nextInt();
        input.nextLine();
        
        if(aux < 1 || aux > 2){
            System.out.println("Opção invalida!");
        }else{
            if(aux == 1){
                System.out.println("Informe o texto claro");
                String texto = input.nextLine();
                texto = texto.replaceAll("\\s+","");
                
                System.out.println("Informe a chave");
                int chave = input.nextInt();
                
                cifra.encriptar(texto, chave);
            }else{
                System.out.println("Informe o criptograma");
                String criptograma = input.nextLine();
                criptograma = criptograma.replaceAll("\\s+","");
                
                System.out.println("Informe a chave");
                int chave = input.nextInt();
                
                cifra.decriptar(criptograma, chave);
            }
        }    
    } 
}

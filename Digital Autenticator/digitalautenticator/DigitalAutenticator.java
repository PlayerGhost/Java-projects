
package digitalautenticator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class DigitalAutenticator {

    public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchAlgorithmException {
        BufferedReader in = new BufferedReader(new FileReader("src/texto.txt"));
        Scanner input = new Scanner(System.in);
        ArvoreAVL arvore = new ArvoreAVL();
        
        System.out.println("ESCOLHA O QUE DESEJA FAZER:");
        System.out.println("1 - Gerar Hash do arquivo.");
        System.out.println("2 - Checar a autenticidade do arquivo atráves do fornecimento de um Hash.");
        int choice = input.nextInt();
        
        while(in.ready()){
            arvore.add(in.readLine());
        }
        
        if(choice == 1){
            System.out.println("O Hash gerado a partir do conteúdo do arquivo é:\n"); 
            System.out.println(arvore.gerarHash());
        }else if(choice == 2){
            System.out.println("Informe o Hash do arquivo a ser checado.");
            String check = input.next();
            
            if(check.equals(arvore.gerarHash())){
                System.out.println();
                System.out.println("O arquivo é autêntico.");
            }else{
                System.out.println("O arquivo não é autêntico.");
            }
        }
        
        
    } 
}

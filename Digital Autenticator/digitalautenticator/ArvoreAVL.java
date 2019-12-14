

package digitalautenticator;

import java.security.NoSuchAlgorithmException;

public class ArvoreAVL {
    private No root;
    private Sha1 sha;
    private No aux;
    private No aux2;

    public ArvoreAVL() {
        root = null;
        sha = new Sha1();
        aux = null;
        aux2 = null;
    }
    
    public int altura(No elemento){
        if(elemento == null){
            return 0;
        }else{
            return elemento.getAltura();
        }
    }
    
    public void add(String line){
        root = add(root, line);
    }
    
    public No add(No elemento, String line){
        if(elemento == null)
            elemento = new No(line);
        
        if(line.compareTo(elemento.getLine()) < 0){
            elemento.setEsquerdo(add(elemento.getEsquerdo(), line));
        }else if(line.compareTo(elemento.getLine()) > 0){
            elemento.setDireito(add(elemento.getDireito(), line));
        }else{
            return elemento;
        }
        
        elemento.setAltura(1 + Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())));
        
        int balance = BalanceFactor(elemento);
        
        if(balance > 1 && line.compareTo(elemento.getEsquerdo().getLine()) < 0){
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && line.compareTo(elemento.getDireito().getLine()) > 0){
            return rotacionarEsquerda(elemento);
        }
        
        if(balance > 1 && line.compareTo(elemento.getEsquerdo().getLine()) > 0){
            elemento.setEsquerdo(rotacionarEsquerda(elemento.getEsquerdo()));
            return rotacionarDireita(elemento);
        }
        
        if(balance < -1 && line.compareTo(elemento.getDireito().getLine()) < 0){
            elemento.setDireito(rotacionarDireita(elemento.getDireito()));
            return rotacionarEsquerda(elemento);
        }
        
        return elemento;
    }
    
    public No rotacionarDireita(No elemento){
        aux = elemento.getEsquerdo(); 
        aux2 = aux.getDireito(); 
  
        aux.setDireito(elemento);
        elemento.setEsquerdo(aux2);
  
        elemento.setAltura(Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())) + 1);
        aux.setAltura(Math.max(altura(aux.getEsquerdo()), altura(aux.getDireito())) + 1);

        return aux; 
    }
    
    public No rotacionarEsquerda(No elemento){
        aux = elemento.getDireito(); 
        aux2 = aux.getEsquerdo(); 
  
        aux.setEsquerdo(elemento);
        elemento.setDireito(aux2); 
  
        elemento.setAltura(Math.max(altura(elemento.getEsquerdo()), altura(elemento.getDireito())) + 1);
        aux.setAltura(Math.max(altura(aux.getEsquerdo()), altura(aux.getDireito())) + 1);
  
        return aux; 
    }
    
    public int BalanceFactor(No elemento){
        if(elemento == null){
            return 0;
        }
        
        return altura(elemento.getEsquerdo()) - altura(elemento.getDireito());
    }
    
    public String gerarHash() throws NoSuchAlgorithmException{
        if(root == null){   
            return "Documento vazio!";
        }else{
            return gerarHash(root);
        }
    }
    
    public String gerarHash(No elemento) throws NoSuchAlgorithmException{
        String leftHash = "";
        String rightHash = "";
        
        if(elemento.getEsquerdo() != null){
            leftHash = gerarHash(elemento.getEsquerdo());
        }
        
        if(elemento.getDireito() != null){
            rightHash = gerarHash(elemento.getDireito());
        }
        
        if(elemento.getEsquerdo() == null && elemento.getDireito() == null){
            return sha.sha1(elemento.getLine());
        }
        
        return sha.sha1(leftHash+rightHash);
    }
}

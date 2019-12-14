
package cifra;

public class Encriptador {
    Alfabeto primeiro;
    Alfabeto ultimo;
    Alfabeto aux;
    Saida temp = new Saida();

    public Encriptador() {
        primeiro = null;
        ultimo = null;
        aux = null;
    }
    
    public void adicionar(char letra){
        Alfabeto novo  = new Alfabeto(letra);
        
        if (primeiro == null){
            primeiro = novo;
            ultimo = novo;
            novo.setProximo(primeiro);
            novo.setAnterior(primeiro);
        }else{
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
            ultimo = novo;
            ultimo.setProximo(primeiro);
            primeiro.setAnterior(ultimo);
        }
    }
    
    public void preencherAlfabeto(){
        char c = 'a';
        
        for(int i = 0; i < 26; i++){
            adicionar(c++);
        }
    }
    
    public Alfabeto posicao(char letra){
        preencherAlfabeto();
        aux = primeiro;
        
        do{
            if(aux.getLetra() == letra){
                break;
            }
            
            aux = aux.getProximo();
        }while(aux != primeiro);
        
        return aux;
    }
    
    public void encriptar(String texto, int chave){
        
        for (int i = 0; i < texto.length(); i++){
            ConsultarEncript(texto.charAt(i), chave);
        }
        
        temp.print();
    }
    
    public void decriptar(String texto, int chave){
        
        for (int i = 0; i < texto.length(); i++){
            ConsultarDecript(texto.charAt(i), chave);
        }
        
        temp.print();
    }
    
    public char ConsultarEncript(char letra, int chave){
        aux = posicao(letra);
        char x = 0;
        
        for (int i = 0; i <= chave; i++){
            x = aux.getLetra();
            aux = aux.getProximo();
        }
        
        temp.adiconar(letra, x);
    
        return x;
    }
    
    public char ConsultarDecript(char letra, int chave){
        aux = posicao(letra);
        char x = 0;
        
        for (int i = 0; i <= chave; i++){
            x = aux.getLetra();
            aux = aux.getAnterior();
        }
        
        temp.adiconar(x, letra);
        
        return x;
    }
}

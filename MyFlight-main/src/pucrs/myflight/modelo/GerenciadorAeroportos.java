package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroportos;
    private int quantidadeAeroportos;

    GerenciadorAeroportos(Aeroporto aeroporto){
        ArrayList<Aeroporto> aeroportos = new ArrayList<>();
        aeroportos.add(aeroporto);
        quantidadeAeroportos = 1;
    }
    
    public void addEntidade(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
        quantidadeAeroportos++;
    }

    public void removeEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0){
                aeroportos.remove(i);
                quantidadeAeroportos--;
            }
        }
        
    }

    public Aeroporto getEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0) return aeroportos.get(i);
        }

        return null;
    }

    public boolean procuraEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0) return true;
        }
        return false;
    }

    public int tamanhoEntidade(){
        return quantidadeAeroportos;
    }
        
    public void listarEntidades(){
        
    }    
}

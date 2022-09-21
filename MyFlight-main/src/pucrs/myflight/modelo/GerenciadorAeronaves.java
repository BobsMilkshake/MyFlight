package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves implements Contavel {

    private ArrayList<Aeronave> frota;
    private int tamanhoFrota;

    GerenciadorAeronaves(Aeronave aviao){
        ArrayList<Aeronave> frota = new ArrayList<>();
        frota.add(aviao);
        tamanhoFrota = 1;
    }

    /**
     * Adiciona um aviao a frota
     * @param a aeronave a ser adicionada
     */
    public void addEntidade(Aeronave aviao){
        frota.add(aviao);
        tamanhoFrota++;
    }

    /**
     * Remove um aviao da frota
     * @param codigo o código da aeronave
     */
    public void removeEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0){
                frota.remove(i);
                tamanhoFrota--;
            } 
        }

    }

    /**
     * Retorna um aviao
     * @param codigo codigo da aeronave
     * @return a aeronave referente ao codigo
     */
    public Aeronave getEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0) return frota.get(i);
        }
        return null;
    }

    /**
     * Procura a aeronave pelo seu codigo
     * @param codigo codigo do aviao
     * @return false se não encontrou ou true se encontrou
     */
    public boolean procuraEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0) return true;
        }
        return false;
    }

    /**
     * Retorna a quantidade de aviões na frota
     */
    public int quantidade(){
        return tamanhoFrota;
    }

    public void listarEntidades(){
        
    }
}

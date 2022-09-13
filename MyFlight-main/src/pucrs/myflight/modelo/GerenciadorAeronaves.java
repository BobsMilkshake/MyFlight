package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> frota;
    private int tamanhoFrota;

    GerenciadorAeronaves(Aeronave aviao){
        ArrayList<Aeronave> frota = new ArrayList<>();
        frota.add(aviao);
        tamanhoFrota = 1;
    }

    public void addEntidade(Aeronave aviao){
        frota.add(aviao);
        tamanhoFrota++;
    }

    public void removeEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0){
                frota.remove(i);
                tamanhoFrota--;
            } 
        }

    }

    public Aeronave getEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0) return frota.get(i);
        }
        return null;
    }

    public boolean procuraEntidade(String codigo){
        for(int i = 0; i < tamanhoFrota; i++){
            if(frota.get(i).getCodigo().compareTo(codigo) == 0) return true;
        }
        return false;
    }

    public int tamanhoEntidade(){
        return tamanhoFrota;
    }

    public void listarEntidades(){
        
    }
}

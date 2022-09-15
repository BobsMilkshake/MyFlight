package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

private ArrayList<Voo> voos;
private int quantidadeDeVoos;

    GerenciadorVoos(Voo voo){
        ArrayList<Voo> voos = new ArrayList<>();
        voos.add(voo);
        quantidadeDeVoos = 1;
    }

    public void addEntidade(Voo voo){
        voos.add(voo);
        quantidadeDeVoos++;

    }

    public void removeEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0){
                voos.remove(i);
                quantidadeDeVoos--;
            }
        }
    }

    public Voo getEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0) return voos.get(i);
        }
        return null;
    }

    public boolean procuraEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0) return true;
        }
        return false;
    }

    public int tamanhoEntidade(){
        return quantidadeDeVoos;
    }

    public void listarEntidades(){

        for(int i = 0; i < quantidadeDeVoos; i++){
            //print("Origem: " + voos.get(i).getRota().getOrigem().getNome());

            //printf("Destino: " + voos.get(i).getRota().getOrigem().getNome());
        }
    }

}

package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    ArrayList<Rota> rotas;
    int quantidadeDeRotas;

    GerenciadorRotas(Rota rota){
        ArrayList<Rota> rotas = new ArrayList<>();
        rotas.add(rota);
        quantidadeDeRotas = 1;
    }

    public void addEntidade(Rota rota){
        rotas.add(rota);
        quantidadeDeRotas++;
    }

    public void removeEntidade(String origem, String destino){
        for(int i = 0; i < quantidadeDeRotas; i++){
            if(rotas.get(i).getDestino().getNome().compareTo(destino) == 0 && rotas.get(i).getOrigem().getNome().compareTo(origem) == 0){
                rotas.remove(i);
                quantidadeDeRotas--;
            }
        } 
    }

    public Voo getEntidade(String origem, String destino){
        for(int i = 0; i < quantidadeDeRotas; i++){
            if(rotas.get(i).getDestino().getNome().compareTo(destino) == 0 && rotas.get(i).getOrigem().getNome().compareTo(origem) == 0){
                rotas.get(i);
            }
        }
        return null;
    }

    public void listEntidades(){

    }
}

package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;
    private int quantidadeDeRotas;

    GerenciadorRotas(Rota rota){
        ArrayList<Rota> rotas = new ArrayList<>();
        rotas.add(rota);
        quantidadeDeRotas = 1;
    }

    /**
     * Adiciona uma rota a lista
     * @param rota objeto rota a ser adicionado
     */
    public void addEntidade(Rota rota){
        rotas.add(rota);
        quantidadeDeRotas++;
    }

    /**
     * Remove uma rota da lista
     * @param origem origem da rota
     * @param destino destino da rota
     */
    public void removeEntidade(String origem, String destino){
        for(int i = 0; i < quantidadeDeRotas; i++){
            if(rotas.get(i).getDestino().getNome().compareTo(destino) == 0 && rotas.get(i).getOrigem().getNome().compareTo(origem) == 0){
                rotas.remove(i);
                quantidadeDeRotas--;
            }
        } 
    }

    /**
     * Retorna uma rota buscando pelo seu destino e sua origem
     * @param origem origem da rota pequisada
     * @param destino destino da rota pesquisada
     * @return o objeto rota caso ele tenha sido encontrado ou null caso ele não tenha sido encontrado
     */
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

    /**
     * Ordena a lista de rotas pelo nome da cia
     */
    public void ordenaCiaNome(){
        Collections.sort(rotas);
    }
}

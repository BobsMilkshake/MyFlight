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

    /**
     * Adiciona um voo a lista
     * @param voo objeto voo a ser adicionado
     */
    public void addEntidade(Voo voo){
        voos.add(voo);
        quantidadeDeVoos++;

    }

    /**
     * Remove voo da lista
     * @param date data do voo
     */
    public void removeEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0){
                voos.remove(i);
                quantidadeDeVoos--;
            }
        }
    }

    /**
     * Retorna o objeto voo pesquisado
     * @return o voo encontrado ou null caso ele não existir
     */
    public Voo getEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0) return voos.get(i);
        }
        return null;
    }

    /**
     * Procura um voo pela sua data
     * @param date data do voo
     * @return retorna true caso ele tenha sido encontrado e falso caso não tenha sido encontrado
     */
    public boolean procuraEntidade(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0) return true;
        }
        return false;
    }

    /**
     * Quantidade de coos presentes na lista
     * @return a quantidade de voos
     */
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

package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroportos;
    private int quantidadeAeroportos;

    GerenciadorAeroportos(Aeroporto aeroporto){
        ArrayList<Aeroporto> aeroportos = new ArrayList<>();
        aeroportos.add(aeroporto);
        quantidadeAeroportos = 1;
    }
    
    /**
     * Adiciona um aeroporto ao grupo
     * @param aeroporto objeto aeroporto a ser adicionado a lista
     */
    public void addEntidade(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
        quantidadeAeroportos++;
    }

    /**
     * Remove aeroporto do grupo
     * @param codigo codigo do aeroporto
     */
    public void removeEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0){
                aeroportos.remove(i);
                quantidadeAeroportos--;
            }
        }
        
    }

    /**
     * Retorna o aeroporto pesquisado
     * @param codigo codigo do aeroporto
     * @return o objeto aeroporto caso ele exista, ou retorna null quando ele não for encontrado
     */
    public Aeroporto getEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0) return aeroportos.get(i);
        }

        return null;
    }

    /**
     * Busca o aeroporto pelo seu codigo
     * @param codigo codigo do aeroporto
     * @return false caso o aeroporto não seja encontrado e true caso ele esteja na lista
     */
    public boolean procuraEntidade(String codigo){
        for(int i = 0; i < quantidadeAeroportos; i++){
            if(aeroportos.get(i).getCodigo().compareTo(codigo) == 0) return true;
        }
        return false;
    }

    /**
     * Retorna o número de aeroportos presentes no grupo
     * @return o número de aeroportos
     */
    public int tamanhoEntidade(){
        return quantidadeAeroportos;
    }
   
    public void sortAeroportos() {
        Collections.sort(aeroportos);
    }

}

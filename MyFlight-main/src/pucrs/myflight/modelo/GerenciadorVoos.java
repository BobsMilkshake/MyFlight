package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorVoos {

private ArrayList<Voo> voos;
private int quantidadeDeVoos;

    GerenciadorVoos(VooDireto vooDi){
        ArrayList<Voo> voos = new ArrayList<>();
        voos.add(vooDi);
        quantidadeDeVoos = 1;
    }

    GerenciadorVoos (VooEscalas vooEs) {
        voos.add(vooEs);
        quantidadeDeVoos = 1;
    }

    /**
     * Adiciona um voo a lista
     * @param vooDi objeto voo a ser adicionado
     */
    public void addVoo(VooDireto vooDi){
        voos.add(vooDi);
        quantidadeDeVoos++;
    }

    /**
     * Adiciona um voo a lista
     * @param voo objeto voo a ser adicionado
     */
    public void addVoo(VooEscalas vooEs){
        voos.add(vooEs);
        quantidadeDeVoos++;
    }

    /**
     * Remove voo da lista
     * @param date data do voo
     */
    public void removeVoo(LocalDateTime date){
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
    public Voo getData(LocalDateTime date){
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
    public boolean procuraData(LocalDateTime date){
        for(int i = 0; i < quantidadeDeVoos; i++){
            if(voos.get(i).getDatahora().compareTo(date) == 0) return true;
        }
        return false;
    }

    /**
     * Quantidade de voos presentes na lista
     * @return a quantidade de voos
     */
    public int tamanhoLista(){
        return quantidadeDeVoos;
    }

    /**
     * Lista as entidades do array
     */
    public void listarEntidades(){

        for(int i = 0; i < quantidadeDeVoos; i++){
            Systam.out.println("Origem: " + voos.get(i).getRota().getOrigem().getNome());

            Systam.out.println("Destino: " + voos.get(i).getRota().getOrigem().getNome());
        }
    }

}

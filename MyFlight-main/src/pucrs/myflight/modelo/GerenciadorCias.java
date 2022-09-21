package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorCias {

	private ArrayList<CiaAerea> cias;
	private int quantidadeDeCias;
	
	GerenciadorCias(CiaAerea cia) {
		cias = new ArrayList<>();
		cias.add(cia);
		quantidadeDeCias = 1;
	}

	/**
	 * Adiciona uma cia aérea à lista
	 * @param cia objeto cia a ser adicionado
	 */
	public void addEntidade(CiaAerea cia){
		cias.add(cia);
		quantidadeDeCias++;
	}

	/**
	 * Remove uma cia aéria da lista
	 * @param codigo código da cia a ser removida
	 */
	public void removeEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0){
				cias.remove(i);
				quantidadeDeCias--;
			} 
		}
	}

	/**
	 * Retorna uma cia aérea pelo seu codigo
	 * @param codigo codigo da cia aérea
	 * @return retorna o objeto da cia correspondente caso ela esteja na lista, e retorna null caso nenhuma seja encontrada
	 */
	public CiaAerea getEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0) return cias.get(i);
		}
		return null;
	}

	/**
	 * Busca uma cia aérea pelo seu codigo
	 * @param codigo codigo da cia aérea
	 * @return false caso ela não esteja na lista e true caso ela esteja
	 */
	public boolean procuraEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0) return true;
		}
		return false;
	}

	/**
	 * Retorna a quantidade de cias aéreas presentes na lista
	 * @return o número de cias aéreas
	 */
	public int tamanhoEntidade(){
		return quantidadeDeCias;
	}

	public void listarEntidades(){
		
	}
	
}

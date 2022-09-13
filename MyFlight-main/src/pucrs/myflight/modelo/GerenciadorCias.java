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

	public void addEntidade(CiaAerea cia){
		cias.add(cia);
		quantidadeDeCias++;
	}

	public void removeEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0){
				cias.remove(i);
				quantidadeDeCias--;
			} 
		}
	}

	public CiaAerea getEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0) return cias.get(i);
		}
		return null;
	}

	public boolean procuraEntidade(String codigo){
		for(int i = 0; i < quantidadeDeCias; i++){
			if(cias.get(i).getCodigo().compareTo(codigo) == 0) return true;
		}
		return false;
	}

	public int tamanhoEntidade(){
		return quantidadeDeCias;
	}

	public void listarEntidades(){
		
	}
	
}

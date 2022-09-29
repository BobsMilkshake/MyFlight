package pucrs.myflight.modelo;

public class Aeronave implements Contavel {
	private String codigo;
	private String descricao;
	private int capacidade;
	private int quantInstancias = 0;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
		this.quantInstancias += 1;

	}
	
	/**
	 * Retorna o codigo da aeronave
	 * @return o codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Retorna a descrição da aeronave
	 * @return a descrição
	 */
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int quantidade() {

		return quantInstancias;
	}
}

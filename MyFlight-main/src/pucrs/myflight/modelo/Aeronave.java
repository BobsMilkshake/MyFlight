package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;

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
}

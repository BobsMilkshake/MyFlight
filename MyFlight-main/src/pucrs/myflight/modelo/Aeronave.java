package pucrs.myflight.modelo;

public class Aeronave {
	private String codigo;
	private String descricao;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
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
}

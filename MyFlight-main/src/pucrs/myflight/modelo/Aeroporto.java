package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto> {
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	/**
	 * Retorna o codigo do aeroporto
	 * @return o codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Retorna o nome do aeroporto
	 * @return o nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Retorna o local do aeroporto
	 * @return o local
	 */
	public Geo getLocal() {
		return loc;
	}

	@Override
	public int compareTo(Aeroporto aero) {
		return (this.nome).compareTo(nome);
	}

    
}

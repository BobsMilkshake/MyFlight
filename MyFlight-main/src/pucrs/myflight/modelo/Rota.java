package pucrs.myflight.modelo;

public class Rota implements Comparable<Rota> {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	/**
	 * Retorna a cia aerea da rota
	 * @return a cia aerea
	 */
	public CiaAerea getCia() {
		return cia;
	}
	
	/**
	 * Retorna o destino da rota
	 * @return o destino
	 */
	public Aeroporto getDestino() {
		return destino;
	}
	
	/**
	 * Retorna a origem da rota
	 * @return a origem
	 */
	public Aeroporto getOrigem() {
		return origem;
	}
	
	/**
	 * Retorna a aeronave da rota
	 * @return a aeronave
	 */
	public Aeronave getAeronave() {
		return aeronave;
	}

	@Override
	public int compareTo(Rota rota) {
		return (this.cia.getNome()).compareTo(rota.cia.getNome());
	}
}

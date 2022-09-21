package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; 
	}

	public Voo(Rota rota, Duration duracao){
		this.rota = rota;
		this.datahora = LocalDateTime.of(2016, 8, 12, 12, 0, 0);
		this.status = Status.CONFIRMADO; 


	}
	
	/**
	 * Retorna a rota do voo
	 * @return a rota
	 */
	public Rota getRota() {
		return rota;
	}
	
	/**
	 * Retorna a data e hora do voo
	 * @return a data e hora
	 */
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	/**
	 * Retorna a duração do voo
	 * @return a duração
	 */
	public Duration getDuracao() {
		return duracao;
	}
	
	/**
	 * Retorna o status do voo
	 * @return o status
	 */
	public Status getStatus() {
		return status;
	}
	
	/**
	 * Determina o status do voo
	 */
	public void setStatus(Status novo) {
		this.status = novo;
	}
}

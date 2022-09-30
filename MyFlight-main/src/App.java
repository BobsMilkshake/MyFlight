

import java.time.LocalDateTime;

import pucrs.myflight.modelo.*;


public class App {

	public static void main(String[] args) {
		//cias aereas 
		CiaAerea latam = new CiaAerea("JJ", "LATAM Linhas Aereas");
		CiaAerea gol = new CiaAerea("G3", "Gol Linhas Aereas SA");
		CiaAerea tap = new CiaAerea("TP", "TAP Portugal");
		CiaAerea azul = new CiaAerea("AZ", "Azul Linhas Aereas");

		//aeronaves
		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);


		//geo
		Geo g1 = new Geo(-29.9939, -51.1711);
		Geo g2 = new Geo(-23.4356, -46.4731);
		Geo g3 = new Geo(38.7742, -9.1342);
		Geo g4 = new Geo(25.7933, -80.2906);
		
		//aeroportos
		Aeroporto salgadoFilho = new Aeroporto("POA", "Salgado Filho Intl Apt", g1);
		Aeroporto guarulhos = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", g2);
		Aeroporto lisboa = new Aeroporto("LIS", "Lisbon", g3);
		Aeroporto miami = new Aeroporto("MIA", "Miami International Apt", g4);

		//rotas
		Rota gruPoa = new Rota(gol, guarulhos, salgadoFilho, a4);
		Rota poaGru = new Rota(gol ,salgadoFilho, guarulhos, a3);
		Rota miaLis = new Rota(tap, miami, lisboa, a1);

		LocalDateTime ldt1 = LocalDateTime.now().plusDays(1).plusMonths(2).plusHours(3);
		VooEscalas teste1 = new VooEscalas(ldt1);
		teste1.adicionaRota(gruPoa);
		System.out.println(teste1.getDuracao().toString());


	}
}

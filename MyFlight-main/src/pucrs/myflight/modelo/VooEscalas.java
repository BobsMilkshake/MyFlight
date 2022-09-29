package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class VooEscalas extends VooAbstrata {

    private ArrayList<Rota> routes;

    public VooEscalas(LocalDateTime dh) {
        super(dh);
        routes = new ArrayList<>();
    }
    
    public void adicionaRota(Rota rota) {
        routes.add(rota);
    }

    /**
	 * Calcula a distancia entre dois pontos
	 * @param geo1 ponto de partida
	 * @param geo2 ponto de chegada
	 * @return a distância entre os pontos
	 */
	public double distancia(Geo geo1, Geo geo2){
		double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;
	}   

    @Override
    public Duration getDuracao() {
        Geo aux1 = routes.get(0).getOrigem().getLocal();
        Geo aux2 = routes.get(0).getDestino().getLocal();
        
        LocalTime inicio = LocalTime.of(0,0,0);
        LocalTime fim = LocalTime.of(0, 0, 0);
        long temp = (long)distancia(aux1, aux2)/805;
        Duration duracao = Duration.between(inicio, fim);
        duracao.plusHours(temp);
        duracao.plusMinutes(30);
        
        return duracao;  
    }

    @Override
    public Rota getRota() {
        return routes.get(0);  
    }

    public ArrayList<Rota> getRotas() {
        return routes;
    }
}

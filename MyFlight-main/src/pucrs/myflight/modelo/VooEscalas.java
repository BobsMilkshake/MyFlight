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

    @Override
    public Duration getDuracao() {
        Geo aux1 = routes.get(0).getOrigem().getLocal();
        Geo aux2 = routes.get(0).getDestino().getLocal();
        
        LocalTime inicio = LocalTime.of(0,0,0);
        LocalTime fim = LocalTime.of(0, 0, 0);
        long temp = (long)Geo.distancia(aux1, aux2)/805;
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

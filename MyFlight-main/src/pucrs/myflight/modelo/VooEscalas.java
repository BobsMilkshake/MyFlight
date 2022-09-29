package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends VooAbstrata {

    private ArrayList<Rota> routes;
    private Duration duracao;

    public VooEscalas(LocalDateTime dh, Duration duracao) {
        super(dh, duracao);
    }
    
    public void adicionaRota(Rota rota) {
        routes.add(rota);
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return routes.get(0);  
    }

    public ArrayList<Rota> getRotas() {
        return routes;
    }
}

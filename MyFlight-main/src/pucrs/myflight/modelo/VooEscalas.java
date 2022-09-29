package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends VooAbstrata {

    private ArrayList<Rota> routes;

    public VooEscalas(LocalDateTime dh) {
        super(dh);
    }
    
    public void adicionaRota(Rota rota) {
        routes.add(rota);
    }

    public Duration getDuracao() {
        return;
        //fazer o calculo quando chegar em casa
    }

    public Rota getRota() {
        return routes.get(0);  
    }

    public ArrayList<Rota> getRotas() {
        return routes;
    }
}

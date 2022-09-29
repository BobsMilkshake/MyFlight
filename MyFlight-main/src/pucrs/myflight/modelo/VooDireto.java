package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends VooAbstrata {
    private Rota rota;

    public VooDireto(LocalDateTime dh, Rota rota) {
        super(dh);
        this.rota = rota;      
    }

    @Override
    public Duration getDuracao() {
        return;
        //fazer o calculo em casa
    }

    @Override
    public Rota getRota() {
        return rota;
    }
    
}

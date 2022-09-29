package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends VooAbstrata {
    private Rota rota;
    private Duration duracao;

    public VooDireto(LocalDateTime dh, Rota rota, Duration duracao) {
        super(dh, duracao);
        this.rota = rota;      
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }
    
}

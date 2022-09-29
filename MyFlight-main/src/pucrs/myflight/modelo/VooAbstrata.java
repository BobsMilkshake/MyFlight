package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class VooAbstrata {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    private LocalDateTime datahora;

    public VooAbstrata(LocalDateTime dh) {
        dh = datahora;
    }

    public LocalDateTime getDataHora() {
        return datahora;
    }

    public abstract Duration getDuracao();
    public abstract Rota getRota();

}

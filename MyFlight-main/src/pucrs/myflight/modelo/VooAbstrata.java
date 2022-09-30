package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class VooAbstrata {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
    private LocalDateTime datahora;
    private Status status;

    public VooAbstrata(LocalDateTime dh, Status status) {
        dh = datahora;
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return datahora;
    }

    public abstract Duration getDuracao();
    public abstract Rota getRota();

}

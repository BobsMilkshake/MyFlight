package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends VooAbstrata {
    private Rota rota;
    private LocalDateTime dh;
    private Status status;

    public VooDireto(LocalDateTime dh, Rota rota, Status status) {
        super(dh, status);
        this.rota = rota;      
    }

    @Override
    public Duration getDuracao() {
        Geo aux1 = routes.get(0).getOrigem().getLocal();
        Geo aux2 = routes.get(0).getDestino().getLocal();
        
        LocalTime inicio = LocalTime.of(0,0,0);
        LocalTime fim = LocalTime.of(0, 0, 0);
        long distance = (long) aux1.distancia(aux2);
        long hours = (distance / 805);
        long minutes = ((distance & 805));
        //long temp = (long)Geo.distancia(aux1, aux2)/805;
        Duration duracao = Duration.between(inicio, fim);
        duracao.plusHours(hours);
        duracao.plusMinutes(minutes + 30);
        //duracao.plusHours(temp);
        //duracao.plusMinutes(30);
        
        return duracao;  
    }

    @Override
    public Rota getRota() {
        return rota;
    }
    
}

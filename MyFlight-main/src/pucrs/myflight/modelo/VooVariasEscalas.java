package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private ArrayList<Rota> listVoos;
    private int size;

    public VooVariasEscalas(Rota rotaInicial, LocalDateTime datahora, Duration duracao, Status status) {
        super(rotaInicial, datahora, duracao, status);

        ArrayList<Rota> listVoos = new ArrayList<Rota>();
        listVoos.add(rotaInicial);
        size = 1;
    }

    public void addRota(Rota rota){
        listVoos.add(rota);
        size++;
    }

    public void removeRotaByIndex(int index){
        listVoos.remove(index);
        size--;
    }

    public void removeRotaByObject(Rota rota){
        listVoos.remove(rota);
        size--;
    }

    public int quantRotas(){
        return size;
    }
}

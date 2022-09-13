package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    ArrayList<Rota> rotas;
    int quantidadeDeRotas;

    GerenciadorRotas(Rota rota){
        ArrayList<Rota> rotas = new ArrayList<>();
        rotas.add(rota);
        quantidadeDeRotas = 1;
    }

    public void addEntidade(Rota rota){
        rotas.add(rota);
        quantidadeDeRotas++;
    }

    public void removeEntidade(String origem){
        
        
    }

    public Voo getEntidade(){

    }

    public boolean procuraEntidade(){

    }

}

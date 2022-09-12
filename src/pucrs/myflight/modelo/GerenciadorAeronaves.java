package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> lista;

    public GerenciadorAeronaves() {
        lista = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao) {
        lista.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return lista;
    }

package br.com.wcc.model;

public class Placa {
    public final int numComponentes;
    public final Componente[] tipoComponentes;

    public Placa(int numComponentes, Componente[] tipoComponentes){
        this.numComponentes = numComponentes;
        this.tipoComponentes = tipoComponentes;
    }
}
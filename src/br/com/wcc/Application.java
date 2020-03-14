package br.com.wcc;

import br.com.wcc.model.Montador;

public class Application {
    public static void main(String[] args) {
        Montador montador = new Montador(2);

        montador.montaPlacas();
    }
}
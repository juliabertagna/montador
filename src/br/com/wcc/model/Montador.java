package br.com.wcc.model;
import java.util.Random; 

public class Montador {
    private final int numPlacas;
    //private Placa[] placas;

    public Montador(int numPlacas){
        this.numPlacas = numPlacas;
        //this.placas = new Placa[numPlacas];
    }

    public void montaPlacas(){
        Placa[] placas = new Placa[numPlacas];

        for(int i = 0; i < numPlacas; i++){
            Random rand = new Random(); 
            int randomNumber = rand.nextInt(50) + 1; 

            placas[i] = geraPlaca(randomNumber);
        }

        imprimePlacas(placas);
    }
  
    private Placa geraPlaca(int quantComponentes){
        Placa coisaMontada = new Placa(quantComponentes, addComponent(quantComponentes));
        return coisaMontada;
    }
    
    private Componente[] addComponent(int quantComponentes){
        Componente[] componentesPossiveis = new Componente[] {new Componente("Conectores"), new Componente("Capacitores")
                                                    , new Componente("Sensor de movimento"), new Componente("Resistores")
                                                    , new Componente("Semicondutor")};
        Componente[] componentesPlaca = new Componente[quantComponentes];

        for(int i = 0; i < quantComponentes; i++){
            Random rand = new Random(); 
            int randomNumber = rand.nextInt(5);
            
            componentesPlaca[i] = componentesPossiveis[randomNumber];  
        }

        return componentesPlaca;
    }
    
    private void imprimePlacas(Placa[] placas){
        for(int j = 0; j < numPlacas; j++){
            System.out.println("Placa de número " + (j+1) +" contém " + placas[j].numComponentes + " componentes: " + componentesPlaca(placas[j].tipoComponentes));
        }
    }

    private StringBuilder componentesPlaca(Componente[] componentes){
        StringBuilder componentesString = new StringBuilder();
        componentesString.append(componentes[0].tipo);

        for(int i = 1; i < componentes.length; i++){
            componentesString.append(", " + componentes[i].tipo);
        }

        componentesString.append(".");
        return componentesString;
    }
}
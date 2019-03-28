package ProjetoCarro;

public class Carro {
    String modelo, cor, marca, proprietario, chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    Double vMax, vAtual, volCombust;
    boolean tetoSolar, cambioAuto;
    //atributos omitidos

    void acelera(){vAtual += 1;
    }
    void freia(){vAtual = 0.0;
    }
    void trocaMarcha(int marchaDesejada){
        marchaAtual = marchaDesejada;
        if (marchaDesejada > nMarchas){
            System.out.println("Marcha Inexistente");
        }else{
            marchaAtual = marchaDesejada;
        }
    }
    void reduzMarcha(){
        marchaAtual = marchaAtual - 1;
    }
}

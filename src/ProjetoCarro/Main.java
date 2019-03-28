package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Mateus";
        proprietario.cpf = "234.655.012-55";
        proprietario.rg = "458833";
        proprietario.dataNasc = "30/03/2005";
        proprietario.rua = "rua da Mata";
        proprietario.bairro = "Marambaia";
        proprietario.cidade = "Belém";
        proprietario.estado = "Pará";
        proprietario.cep = "66645-665";
        proprietario.complemento = "Ap f";

        Carro carro = new Carro();
        carro.modelo = "sedan";
        carro.cor = "prata";
        carro.ano = "2010";
        carro.marca = "Ford";
        carro.chassi = "BR234987644433TZ";
        carro.proprietario = proprietario;
        carro.vMax = 180;
        carro.vAtual = 10;
        carro.nPortas = 5;
        carro.tetoSolar = ;
        carro.nMarchas = 5;
        carro.marchaAtual = 1;
        carro.cambioAuto = 1;
        carro.volCombust = 60;
    }
}

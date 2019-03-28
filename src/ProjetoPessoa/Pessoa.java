package ProjetoPessoa;

public class Pessoa {

    private String nome;
    private String cpf;
    //inserindo construtor:
    Pessoa(String nome, String cpf ){
        this.nome = nome;
        this.cpf = cpf;
    }
    //inserindo encapsulamento
    public void setNome(String nome){
        this.nome = nome;
    }
    public  String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
}

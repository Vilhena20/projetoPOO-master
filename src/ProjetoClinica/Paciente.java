package ProjetoClinica;

public class Paciente {
    String nome, rg, cpf, datanasc, situacao;
    Double altura;
    int idade;

    void descansar(){
        System.out.println("Paciente em repouso");
    }
    void alimentacao(){
        System.out.println("Paciente sendo alimentado");
    }
    String feliz(){
        return ":)";
    }
    String triste(){
        return ":(";
    }
}

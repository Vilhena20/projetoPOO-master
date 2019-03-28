package ProjetoClinica;

public class Paciente {
    String nome, rg, cpf, dataNascimento, triagem, convenio;
    Double altura, peso;
    int idade;

    void examinar(){
        System.out.println("Paciente no laboratório");
    }
    void preocupado(){
        System.out.println("><");
    }
    void descansar(){
        System.out.println("Paciente descansando");
    }
    void feliz() {
        System.out.println(":)");
    }

}

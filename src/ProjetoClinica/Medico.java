package ProjetoClinica;

public class Medico {
    String nome, crm, cpf, especialidade;
    Double salario;
    int idade;

    void clinicar(){System.out.println("Médico no consultório"); }
    void operar(){
        System.out.println("Médico na sala de cirurgia");
    }

}

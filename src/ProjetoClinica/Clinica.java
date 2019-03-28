package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        Paciente paciente = new Paciente();
        paciente.nome = "Lucas";
        paciente.rg = "45789/PA";
        paciente.cpf = "023.567.777-45";
        paciente.datanasc = "30/02/1995";
        paciente.situacao = "Grave";
        paciente.altura = 1.83;
        paciente.idade = 34;

        paciente.alimentacao();
        paciente.descansar();
        paciente.feliz();

        Medico medico = new Medico();
        medico.nome = "Marcela";
        medico.crm = "256778-2/BR";
        medico.cpf = "234.678.876-45";
        medico.especialidade = "cardiologia";
        medico.salario = 9.500;
        medico.idade = 56;

        medico.operar();

        AtendimentoMedico atendimento1 = new AtendimentoMedico();
        atendimento1.situacao = "Encaminhado";
        atendimento1.senha = 20305;
        atendimento1.setor = 4;
        atendimento1.cirurgia = true;

        System.out.println("Paciente "+paciente.nome+", senha: "+atendimento1.senha+
                ", setor "+atendimento1.setor+", com a Médica "+medico.nome+" "+medico.especialidade);




    }
}

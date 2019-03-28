package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Lucas";
        paciente1.rg = "45789/PA";
        paciente1.cpf = "023.567.777-45";
        paciente1.dataNascimento = "30/02/1995";
        paciente1.triagem = "verde";
        paciente1.altura = 1.83;
        paciente1.idade = 34;

        paciente1.examinar();
        paciente1.preocupado();

        Paciente paciente2 = new Paciente();
        paciente2.nome = "Laís";
        paciente2.rg = "768321/AM";
        paciente2.cpf = "223.765.444-23";
        paciente2.dataNascimento = "03/02/1999";
        paciente2.triagem = "vermelho";
        paciente2.altura = 1.60;
        paciente2.idade = 22;

        paciente2.descansar();
        paciente2.feliz();

        Medico medico1 = new Medico();
        medico1.nome = "Marcela";
        medico1.crm = "256778-2/BR";
        medico1.cpf = "234.678.876-45";
        medico1.especialidade = "cardiologia";
        medico1.salario = 9.500;
        medico1.idade = 56;

        medico1.clinicar();

        Medico medico2 = new Medico();
        medico2.nome = "Tadeu";
        medico2.crm = "456732-9/BR";
        medico2.cpf = "223.113.666-78";
        medico2.especialidade = "cirurgia plástica";
        medico2.salario = 15.500;
        medico2.idade = 35;

        medico2.operar();

        AtendimentoMedico atendimento1 = new AtendimentoMedico();
        atendimento1.dataConsulta = "20/04/2018";
        atendimento1.paciente = paciente1;
        atendimento1.medico = medico1;
        atendimento1.etapa = "iniciado";
        atendimento1.procedimento = "testes cardiológicos";
        atendimento1.senha = 74;
        atendimento1.setor = 2;

        System.out.println("Paciente "+paciente1.nome+", senha: "+atendimento1.senha+
                ", setor "+atendimento1.setor+", com a Médica "+medico1.nome+", da "+medico1.especialidade+
                ". Aguardar resultados na sala de espera.");

        AtendimentoMedico atendimento2 = new AtendimentoMedico();
        atendimento1.dataConsulta = "30/10/2018";
        atendimento1.paciente = paciente2;
        atendimento1.medico = medico2;
        atendimento2.etapa = "Finalizado";
        atendimento2.senha = 20305;
        atendimento2.setor = 7;
        atendimento2.procedimento = "Rinoplastia";

        System.out.println("Paciente "+paciente2.nome+", senha: "+atendimento2.senha+
                ", setor "+atendimento2.setor+", com o Médico "+medico2.nome+" da "+medico2.especialidade+
                " procedimento de "+atendimento2.procedimento+" "+atendimento2.etapa);





    }
}

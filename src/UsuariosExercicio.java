public class UsuariosExercicio {
    static int totalusuarios;
    private String nome;

    public UsuariosExercicio(){

    }
    public UsuariosExercicio(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void logar(){
        totalusuarios++;
    }
    public void deslogar(){
        totalusuarios--;
    }
}


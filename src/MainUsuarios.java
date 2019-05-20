public class MainUsuarios {
    public static void main(String args[]){
        UsuariosExercicio u1 = new UsuariosExercicio("Adonias");
        UsuariosExercicio u2 = new UsuariosExercicio("Jonas");
        UsuariosExercicio u3 = new UsuariosExercicio("Pedro");
        u1.logar();
        u2.logar();
        u3.logar();
        System.out.println(UsuariosExercicio.totalusuarios);
    }
}

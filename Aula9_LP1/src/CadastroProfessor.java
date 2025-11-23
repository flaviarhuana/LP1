import java.util.ArrayList;

public class CadastroProfessor {
    private final ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor p){
        professores.add(p);
        System.out.println("Professor cadastrado: "+ p.getNome());
    }
    public void listar(){
        for (Professor p : professores){
            System.out.println("Professor listado: "+ p.getNome());
        }
    }

}


import java.util.ArrayList;

public class SistemaCadastro {
    // Lista para armazenar os usuários
    private ArrayList<Usuario> usuarios;

    //Criando a classe construtura 
    public SistemaCadastro(){
        usuarios = new ArrayList<>();
    }

    //Método para adicionar um novo usuário
    public void cadastrarUsuario(String nome, String email, int idade){
        Usuario novoUsuario = new Usuario(nome, email, idade);
        usuarios.add(novoUsuario);
        System.out.println("Usuário " + nome + " cadastrado com sucesso!"); 
    }

    //Método para buscar um usuário pelo nome 
    public Usuario buscarUsuarioPorNome(String nome){
        for (Usuario usuario : usuarios){
            if (usuario.getNome().equalsIgnoreCase(nome)){
                return usuario;
            }
        }
        return null; // Retorna null caso o usuário não seja encontrado
    }

      // Método para excluir um usuário pelo ID
      public String excluirUsuario(String nome) {
        Usuario usuario = buscarUsuarioPorNome(nome);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuário " + usuario.getNome() + " excluído com sucesso.");
            return null;
            
        } else {
            System.out.println("Usuário não encontrado.");
            return null;
            
        }
    }

    //Método para listar todos os usuários
    public void listarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios){
                System.out.println(usuario);
            }
        }
    }
}

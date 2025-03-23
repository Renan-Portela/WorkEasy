import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios;

    public GerenciadorUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNome() + " adicionado com sucesso.");
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome());
        }
    }

    public Usuario getUsuarioById(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
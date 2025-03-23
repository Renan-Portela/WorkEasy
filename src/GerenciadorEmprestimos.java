import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimos {
    private List<Emprestimo> emprestimos;

    public GerenciadorEmprestimos() {
        emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo adicionado com sucesso.");
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Usuário: " + emprestimo.getUsuario() + ", Equipamento: " + emprestimo.getEquipamento().getNome());
        }
    }
}
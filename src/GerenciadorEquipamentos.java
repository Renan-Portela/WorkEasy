import java.util.ArrayList;
import java.util.List;

public class GerenciadorEquipamentos {
    private List<Equipamento> equipamentos;

    public GerenciadorEquipamentos() {
        equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
        System.out.println("Equipamento " + equipamento.getNome() + " adicionado com sucesso.");
    }

    public void listarEquipamentos() {
        for (Equipamento equipamento : equipamentos) {
            System.out.println("ID: " + equipamento.getId() + ", Nome: " + equipamento.getNome());
        }
    }

    public Equipamento getEquipamentoById(int id) {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getId() == id) {
                return equipamento;
            }
        }
        return null;
    }
}
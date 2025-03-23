import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Criando gerenciadores
        GerenciadorUsuarios gerenciadorUsuarios = new GerenciadorUsuarios();
        GerenciadorEquipamentos gerenciadorEquipamentos = new GerenciadorEquipamentos();
        GerenciadorEmprestimos gerenciadorEmprestimos = new GerenciadorEmprestimos();

        // Criando interfaces gráficas
        new UsuarioGUI(gerenciadorUsuarios);
        new EquipamentoGUI(gerenciadorEquipamentos);
        new EmprestimoGUI(gerenciadorEmprestimos, gerenciadorUsuarios, gerenciadorEquipamentos);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class EmprestimoGUI {
    private GerenciadorEmprestimos gerenciador;
    private GerenciadorUsuarios gerenciadorUsuarios;
    private GerenciadorEquipamentos gerenciadorEquipamentos;

    public EmprestimoGUI(GerenciadorEmprestimos gerenciador, GerenciadorUsuarios gerenciadorUsuarios, GerenciadorEquipamentos gerenciadorEquipamentos) {
        this.gerenciador = gerenciador;
        this.gerenciadorUsuarios = gerenciadorUsuarios;
        this.gerenciadorEquipamentos = gerenciadorEquipamentos;

        // Criando a interface gráfica
        JFrame frame = new JFrame("Cadastro de Empréstimos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        // Campos de entrada
        JLabel labelUsuarioId = new JLabel("ID do Usuário:");
        JTextField textUsuarioId = new JTextField();
        JLabel labelEquipamentoId = new JLabel("ID do Equipamento:");
        JTextField textEquipamentoId = new JTextField();
        JLabel labelDataEmprestimo = new JLabel("Data de Empréstimo:");
        JTextField textDataEmprestimo = new JTextField();
        JLabel labelDataDevolucao = new JLabel("Data de Devolução:");
        JTextField textDataDevolucao = new JTextField();

        // Botão para adicionar empréstimo
        JButton buttonAdicionar = new JButton("Adicionar Empréstimo");
        buttonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int usuarioId = Integer.parseInt(textUsuarioId.getText());
                int equipamentoId = Integer.parseInt(textEquipamentoId.getText());
                Date dataEmprestimo = new Date(textDataEmprestimo.getText());
                Date dataDevolucao = new Date(textDataDevolucao.getText());

                Usuario usuario = gerenciadorUsuarios.getUsuarioById(usuarioId);
                Equipamento equipamento = gerenciadorEquipamentos.getEquipamentoById(equipamentoId);

                Emprestimo emprestimo = new Emprestimo(usuario, equipamento, dataEmprestimo, dataDevolucao);
                gerenciador.adicionarEmprestimo(emprestimo);

                // Limpar campos
                textUsuarioId.setText("");
                textEquipamentoId.setText("");
                textDataEmprestimo.setText("");
                textDataDevolucao.setText("");
            }
        });

        // Adicionando componentes ao frame
        frame.add(labelUsuarioId);
        frame.add(textUsuarioId);
        frame.add(labelEquipamentoId);
        frame.add(textEquipamentoId);
        frame.add(labelDataEmprestimo);
        frame.add(textDataEmprestimo);
        frame.add(labelDataDevolucao);
        frame.add(textDataDevolucao);
        frame.add(new JLabel()); // Espaço vazio
        frame.add(buttonAdicionar);

        // Exibindo a interface gráfica
        frame.setVisible(true);
    }
}
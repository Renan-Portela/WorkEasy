import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioGUI {
    private GerenciadorUsuarios gerenciador;

    public UsuarioGUI(GerenciadorUsuarios gerenciador) {
        this.gerenciador = gerenciador;

        // Criando a interface gráfica
        JFrame frame = new JFrame("Cadastro de Usuários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        // Campos de entrada
        JLabel labelId = new JLabel("ID:");
        JTextField textId = new JTextField();
        JLabel labelNome = new JLabel("Nome:");
        JTextField textNome = new JTextField();
        JLabel labelCpf = new JLabel("CPF:");
        JTextField textCpf = new JTextField();
        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField textTelefone = new JTextField();

        // Botão para adicionar usuário
        JButton buttonAdicionar = new JButton("Adicionar Usuário");
        buttonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textId.getText());
                String nome = textNome.getText();
                int cpf = Integer.parseInt(textCpf.getText());
                int telefone = Integer.parseInt(textTelefone.getText());

                Usuario usuario = new Usuario(id, nome, cpf, telefone);
                gerenciador.adicionarUsuario(usuario);

                // Limpar campos
                textId.setText("");
                textNome.setText("");
                textCpf.setText("");
                textTelefone.setText("");
            }
        });

        // Adicionando componentes ao frame
        frame.add(labelId);
        frame.add(textId);
        frame.add(labelNome);
        frame.add(textNome);
        frame.add(labelCpf);
        frame.add(textCpf);
        frame.add(labelTelefone);
        frame.add(textTelefone);
        frame.add(new JLabel()); // Espaço vazio
        frame.add(buttonAdicionar);

        // Exibindo a interface gráfica
        frame.setVisible(true);
    }
}
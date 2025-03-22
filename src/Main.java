import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        /*
        GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();

        Usuario usuario1 = new Usuario(gerenciador);
        usuario1.setId(1);
        usuario1.setNome("Renan Portela");
        usuario1.setCpf(1234567890);
        usuario1.setTelefone(99999999);

        Usuario usuario2 = new Usuario(gerenciador);
        usuario2.setId(2);
        usuario2.setNome("José Vitor");
        usuario2.setCpf(1233214567);
        usuario2.setTelefone(44444444);

        gerenciador.listarUsuarios();
        */
        GerenciadorUsuarios gerenciador = new GerenciadorUsuarios();

        JFrame frame = new JFrame("Cadastro de Usuários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6,2));

        JLabel labelId = new JLabel("ID:");
        JTextField textId = new JTextField();
        JLabel labelNome = new JLabel("Nome:");
        JTextField textNome = new JTextField();
        JLabel labelCpf = new JLabel("CPF:");
        JTextField textCpf = new JTextField();
        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField textTelefone = new JTextField();

        JButton buttonAdicionar = new JButton("Adicionar Usuário");
        buttonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Interger
            }
        });
    }
}
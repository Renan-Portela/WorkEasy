import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipamentoGUI {
    private GerenciadorEquipamentos gerenciador;

    public EquipamentoGUI(GerenciadorEquipamentos gerenciador) {
        this.gerenciador = gerenciador;

        // Criando a interface gráfica
        JFrame frame = new JFrame("Cadastro de Equipamentos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Campos de entrada
        JLabel labelId = new JLabel("ID:");
        JTextField textId = new JTextField();
        JLabel labelNome = new JLabel("Nome:");
        JTextField textNome = new JTextField();
        JLabel labelNumeroSerie = new JLabel("Número de Série:");
        JTextField textNumeroSerie = new JTextField();
        JLabel labelStatus = new JLabel("Status:");
        JCheckBox checkBoxStatus = new JCheckBox();

        // Botão para adicionar equipamento
        JButton buttonAdicionar = new JButton("Adicionar Equipamento");
        buttonAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textId.getText());
                String nome = textNome.getText();
                int numeroSerie = Integer.parseInt(textNumeroSerie.getText());
                boolean status = checkBoxStatus.isSelected();

                Equipamento equipamento = new Equipamento();
                equipamento.setId(id);
                equipamento.setNome(nome);
                equipamento.setNumeroSerie(numeroSerie);
                equipamento.setStatus(status);

                gerenciador.adicionarEquipamento(equipamento);

                // Limpar campos
                textId.setText("");
                textNome.setText("");
                textNumeroSerie.setText("");
                checkBoxStatus.setSelected(false);
            }
        });

        // Adicionando componentes ao frame
        frame.add(labelId);
        frame.add(textId);
        frame.add(labelNome);
        frame.add(textNome);
        frame.add(labelNumeroSerie);
        frame.add(textNumeroSerie);
        frame.add(labelStatus);
        frame.add(checkBoxStatus);
        frame.add(new JLabel()); // Espaço vazio
        frame.add(buttonAdicionar);

        // Exibindo a interface gráfica
        frame.setVisible(true);
    }
}
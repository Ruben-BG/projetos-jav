package _05Formulario;

import javax.swing.*;

public class VisualizacaoTabela extends JFrame {

    private JTable visualizacaoTabela;
    private JPanel tabelaPanel;

    //atributo para colunas da tabela
    public String colunasDoForm[] = {"Nome", "Email", "Endereço", "Telefone", "CPF"};

    public VisualizacaoTabela() {

        setTitle("Tabela");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(360, 180);
        setContentPane(tabelaPanel);
        pack();
        setVisible(true);

    }

}

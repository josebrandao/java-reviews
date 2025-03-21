import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEnviar;

    public TelaLogin() {
        setTitle("Tela de Login");
        setSize(400, 250);
        setMinimumSize(new Dimension(600, 250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Painel para os campos
        JPanel painelCampos = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os elementos
        gbc.gridx = 0;
        gbc.gridy = 0;

        JLabel lblUsuario = new JLabel("Usuário:");
        txtUsuario = new JTextField();
        txtUsuario.setPreferredSize(new Dimension(200, 25)); // Definindo tamanho

        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();
        txtSenha.setPreferredSize(new Dimension(200, 25)); // Definindo tamanho

        // Adicionando os componentes no painel
        painelCampos.add(lblUsuario, gbc);
        gbc.gridy++;
        painelCampos.add(txtUsuario, gbc);
        gbc.gridy++;
        painelCampos.add(lblSenha, gbc);
        gbc.gridy++;
        painelCampos.add(txtSenha, gbc);

        // Painel do botão centralizado
        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnEnviar = new JButton("Entrar");
        btnEnviar.setPreferredSize(new Dimension(100, 30)); // Definindo tamanho do botão
        painelBotao.add(btnEnviar);

        // Evento do botão
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());

                if (usuario.equals("admin") && senha.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
                }
            }
        });

        // Adicionando painéis à tela
        add(painelCampos, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}

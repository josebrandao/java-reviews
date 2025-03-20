import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Usuario extends Application {

    // Atributos do usuário
    public String username;
    public String password;
    public String email;
    public boolean ativo;

    // Construtor
    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Método para verificar se o usuário está ativo
    public boolean isActive() {
        return ativo;
    }

    // Método JavaFX start (ponto de entrada para a interface gráfica)
    @Override
    public void start(Stage primaryStage) {
        // Campos de entrada para o nome de usuário, senha e e-mail
        TextField usernameField = new TextField();
        TextField passwordField = new TextField();
        TextField emailField = new TextField();
        
        // Botão de ação (para "criar usuário")
        Button createButton = new Button("Criar Usuário");

        // Ação do botão
        createButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String email = emailField.getText();

            // Cria o objeto Usuario com os dados fornecidos
            Usuario usuario = new Usuario(username, password, email);

            // Exibe os dados do usuário (pode ser ajustado conforme necessário)
            System.out.println("Usuário Criado:");
            System.out.println("Nome de usuário: " + usuario.username);
            System.out.println("E-mail: " + usuario.email);
        });

        // Layout da interface gráfica (VBox)
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(usernameField, passwordField, emailField, createButton);

        // Criação da cena e exibição da janela
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Cadastro de Usuário");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método main para iniciar a aplicação JavaFX
    public static void main(String[] args) {
        launch(args);  // Lança a aplicação JavaFX
    }
}

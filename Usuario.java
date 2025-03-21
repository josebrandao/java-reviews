import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        this.ativo = true;  // Definindo como ativo por padrão
    }

    // Método para verificar se o usuário está ativo
    public boolean isActive() {
        return ativo;
    }

    // Método para exibir as informações do usuário
    public String exibirInformacoes() {
        return "Usuário Criado:\n" +
               "Nome de usuário: " + username + "\n" +
               "E-mail: " + email + "\n" +
               "Ativo: " + isActive();
    }

    // Método JavaFX: ponto de entrada para a interface gráfica
    @Override
    public void start(Stage primaryStage) {
        // Criando um novo usuário com dados simulados
        Usuario usuario = new Usuario("josebrandao", "senha123", "jose@example.com");

        // Criando elementos gráficos
        Label label = new Label(usuario.exibirInformacoes());

        // Layout do JavaFX (VBox - Layout vertical)
        VBox vbox = new VBox(10);
        vbox.getChildren().add(label);

        // Criando a cena (Scene)
        Scene scene = new Scene(vbox, 300, 200);

        // Configurando o palco (Stage)
        primaryStage.setTitle("Informações do Usuário");
        primaryStage.setScene(scene);

        // Mostrando a interface gráfica
        primaryStage.show();
    }

    // Método main: ponto de entrada da aplicação
    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}

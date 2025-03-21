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
               // "E-mail: " + email + "\n" +
               "Ativo: " + isActive();
    }

    // Método JavaFX: ponto de 

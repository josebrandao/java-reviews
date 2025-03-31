import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField

fun main() {
    val frame = JFrame("Pesquisa em Urano")
    frame.setSize(400, 300)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = null

    val label = JLabel("Digite o que você quer pesquisar:")
   label.setBounds(90, 20, 300, 30)
   val label2 = JLabel("<html>1- Pesquisar ETs<br>2- Pesquisar Naves Espaciais<br>3- Pesquisar Robôs Exploradores de Marte</html>")
   label2.setBounds(90, 50, 300, 60)

   

    val input = JTextField()
    input.setBounds(90, 120, 200, 30)

    val button = JButton("Pesquisar")
    button.setBounds(140, 170, 120, 40)

    val result = JLabel("")
    result.setBounds(90, 220, 300, 30)

    button.addActionListener {
        val escolha = input.text.toIntOrNull()
        result.text = when (escolha) {
            1 -> "Pesquisando ETs..."
            2 -> "Pesquisando Naves Espaciais..."
            3 -> "Pesquisando Robô Explorador de Marte..."
            else -> "Opção inválida! Digite 1, 2 ou 3."
        }
    }

    frame.add(label)
    frame.add(label2)
    frame.add(input)
    frame.add(button)
    frame.add(result)
    frame.isVisible = true
}

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
    val frame = JFrame("Janela Kotlin - Urano")
    frame.setSize(400, 300)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = null

    val label = JLabel("Bem-vindo ao planeta Urano!")
    label.setBounds(90, 50, 300, 30)

    val button = JButton("Explorar")
    button.setBounds(140, 100, 120, 40)

    button.addActionListener {
        label.text = "Você está explorando Urano!"
    }

    frame.add(label)
    frame.add(button)
    frame.isVisible = true
}

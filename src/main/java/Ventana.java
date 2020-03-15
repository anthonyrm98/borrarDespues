import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel lblNombre;
    private JTextField txtFNombre;
    private JButton btnGuardar;

    public Ventana(){
        super("Ejemplo Swing Intellij IDEA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
    }
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame=new Ventana();
                frame.setSize(300,450);
                frame.setVisible(true);
            }
        });
    }
}

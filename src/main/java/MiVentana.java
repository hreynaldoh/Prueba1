/**
 *
 * @author hreynaldoh
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiVentana extends JFrame {
    public MiVentana() {
        super("Mi otra ventana");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Aceptar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}

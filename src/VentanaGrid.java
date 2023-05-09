import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame {
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button btnBoton1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        layout = new GridLayout(3, 2);
        this.setSize(800, 600);
        this.setLayout(layout);

        lblEtiqueta1= new Label("Etiqueta1");
        this.add(lblEtiqueta1, 0);
        txtCuadro1 = new TextField(30);
        this.add(txtCuadro1, 1);

        lblEtiqueta2= new Label("Etiqueta2");
        this.add(lblEtiqueta2, 2);
        txtCuadro2 = new TextField(30);
        this.add(txtCuadro2, 3);

        btnBoton1 = new Button("Presioname");
        this.add(btnBoton1, 4);

        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = txtCuadro1.getText() + "   " +  txtCuadro2.getText();
                JOptionPane.showMessageDialog(null, texto);

            }
        });

        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

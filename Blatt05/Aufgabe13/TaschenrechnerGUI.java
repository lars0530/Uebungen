import java.awt.*;
import java.awt.event.*;

public class TaschenrechnerGUI extends Frame implements ActionListener {
    private Button Addiere = new Button("Addiere");
    private Button Multipliziere = new Button("Multipliziere");
    private TextField eingabeFeld = new TextField(10);
    private TextField ergebnisFeld = new TextField("0", 10);

    public TaschenrechnerGUI() {
        super("KundenGUI");
        setLayout(new FlowLayout());
        Addiere.addActionListener(this);
        Multipliziere.addActionListener(this);
        eingabeFeld.addActionListener(this);
        ergebnisFeld.addActionListener(this);

        // are enabled by default

        // Zahlenfeld 2 nicht schreibbar
        ergebnisFeld.setEditable(false);
        ergebnisFeld.setEnabled(true);
        eingabeFeld.setText("");
        ergebnisFeld.setText("0");
        add(Addiere);
        add(Multipliziere);
        add(eingabeFeld);
        add(ergebnisFeld);

        // optional to make closing the window work
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setBounds(400, 400, 150, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getSource().equals(Addiere)) {
                int zahl1 = Integer.parseInt(eingabeFeld.getText());
                int zahl2 = Integer.parseInt(ergebnisFeld.getText());
                int ergebnis = zahl1 + zahl2;
                ergebnisFeld.setText(Integer.toString(ergebnis));
            } else if (event.getSource().equals(Multipliziere)) {
                int zahl1 = Integer.parseInt(eingabeFeld.getText());
                int zahl2 = Integer.parseInt(ergebnisFeld.getText());
                int ergebnis = zahl1 * zahl2;
                ergebnisFeld.setText(Integer.toString(ergebnis));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    static public void main(String[] args) {
        new TaschenrechnerGUI();
    }

}

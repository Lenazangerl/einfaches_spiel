package lzangerl.View;

import javax.swing.*;
import java.awt.*;

/**
 * @author Lena Zangerl
 * @version 2026-09-25
 * Diese Klasse enthält die View und Controller verbindung Gewinnspiels.
 */
public class GewinnView extends JFrame {
    private JTextField spielerZahl;
    private JTextField compZahl;
    private JLabel rundenErgebnis;
    private JLabel gesamtErgebnis;
    private JButton btnWh;

    public GewinnView() {
        super("Zahlen-Gewinnspiel");

        BorderLayout basis = new BorderLayout();
        this.setLayout(basis);

        JPanel punkteAnzeige = new JPanel(new GridLayout(3, 2));

        JLabel runde = new JLabel();
        runde.setOpaque(true);
        runde.setText("Rundenergebnis: ");
        runde.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(runde);


        JLabel gesamt = new JLabel();
        gesamt.setOpaque(true);
        gesamt.setText("Gesamtpunkte: ");
        gesamt.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(gesamt);


        runde = new JLabel();
        runde.setOpaque(true);
        runde.setBackground(new Color(255, 255, 255));
        runde.setText("Tippe eine Zahl von 1 bis 9");
        runde.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(runde);

        gesamt = new JLabel();
        gesamt.setOpaque(true);
        gesamt.setBackground(new Color(255, 255, 255));
        gesamt.setText("Gesamtpunkte: ");
        gesamt.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(gesamt);

        JLabel spielerAnzeige = new JLabel();
        spielerAnzeige.setOpaque(true);
        spielerAnzeige.setText("Deine Zahl: ");
        spielerAnzeige.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(spielerAnzeige);


        JLabel compAnzeige = new JLabel();
        compAnzeige.setOpaque(true);
        compAnzeige.setText("Computer: ");
        compAnzeige.setHorizontalAlignment(SwingConstants.CENTER);
        punkteAnzeige.add(compAnzeige);

        JPanel textfelder = new JPanel(new GridLayout(1, 2));

        // spalten anzahl
        spielerZahl = new JTextField();
        textfelder.add(spielerZahl);

        // spalten anzahl
        compZahl = new JTextField();
        textfelder.add(compZahl);

        btnWh = new JButton("Noch einmal!");
        // Ein Panel damit der Button direkt mittig ist
        JPanel btn = new JPanel(new FlowLayout());
        btn.add(btnWh);
        this.add(btn, BorderLayout.SOUTH);


        this.add(punkteAnzeige, BorderLayout.NORTH);
        this.add(textfelder, BorderLayout.CENTER);

        this.getCompZahl().setEditable(false);

        // Fenster Eigenschaften setzen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 500, 300);
        this.setVisible(true);
    }

    public JTextField getSpielerZahl() {
        return spielerZahl;
    }

    public JTextField getCompZahl() {
        return compZahl;
    }

    public JLabel getRundenErgebnis() {
        return rundenErgebnis;
    }

    public JLabel getGesamtErgebnis() {
        return gesamtErgebnis;
    }

    public JButton getBtnWh() {
        return btnWh;
    }
}


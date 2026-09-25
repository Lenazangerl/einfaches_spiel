package lzangerl.View;

import javax.swing.*;
import java.awt.*;

/**
 * @author Lena Zangerl
 * @version 2026-09-25
 * Diese Klasse enthält die View und Controller verbindung Gewinnspiels.
 */
public class GewinnView extends JPanel {
    private JTextField spielerZahl;
    private JTextField compZahl;
    private JLabel rundenErgebnis;
    private JLabel gesamtErgebnis;
    private JButton btnWh;

    public GewinnView() {
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

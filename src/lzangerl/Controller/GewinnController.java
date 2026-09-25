package lzangerl.Controller;

import lzangerl.Model.GewinnModel;
import lzangerl.View.GewinnView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Lena Zangerl
 * @version 2026-09-25
 * Diese Klasse enthält die Verdrahtung von View zur logik.
 */
public class GewinnController implements ActionListener {
    private GewinnModel model;
    private GewinnView view;

    public GewinnController() {
        model = new GewinnModel();
        view = new GewinnView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("Noch einmal!")) {
            view.clearRunde();
            view.setEingabeAktiv(true);
            view.setNochmalAktiv(false);
        }

        if(command.equals("Eingabe")) {
            try {
                int zahl = Integer.parseInt(view.getSpielerZahl().getText());

                if (zahl >= 1 && zahl <= 9) {
                    model.berechneRunde(zahl);

                    view.setCompZahl("" + model.getComputerZahl());
                    view.setRundenErgebnis("" + model.getRundenErgebnis());
                    view.setGesamtErgebnis("" + model.getGesamtPunkte());
                    view.setEingabeAktiv(false);
                    view.setNochmalAktiv(true);
                }
            } catch (NumberFormatException ex) {
                // ungültige Eingabe
            }
        }

    }

    public static void main(String[] args) {
        new GewinnController();
    }
}

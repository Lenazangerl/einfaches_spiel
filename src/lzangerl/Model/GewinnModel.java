package lzangerl.Model;


/**
 * @author Lena Zangerl
 * @version 2026-09-25
 * Die Klasse enthält die Spiellogik eines kleinen Zahlen Gewinnspiels.
 */
public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        // startwert
        this.gesamtPunkte = 30;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        int z = (int) (Math.random() * 9) + 1;
        this.computerZahl = z;
    }

    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;
        berechneComputerZahl();

        if(spielerZahl == getComputerZahl()) {
            this.rundenErgebnis = 20;
        }
        else if((getComputerZahl() - spielerZahl) == -1 || (getComputerZahl() - spielerZahl) == 1) {
            this.rundenErgebnis = 5;
        }
        else {
            this.rundenErgebnis = -10;
        }

        // Ändern des Gesamtpunktestandes
        this.gesamtPunkte = this.getGesamtPunkte() + this.rundenErgebnis;
    }

    public boolean hatGewonnen() {
        return gesamtPunkte >= 100;
    }

    public boolean hatVerloren() {
        return gesamtPunkte <= 0;
    }
}

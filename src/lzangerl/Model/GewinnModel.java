package lzangerl.Model;

public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel(int zahl) {
        this.gesamtPunkte = 30;

        if(zahl > 0 && zahl < 10) {
            this.spielerZahl = zahl;
        }
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

        if(spielerZahl == getComputerZahl()) {
            this.rundenErgebnis = 20;
        }
        if((getComputerZahl() - spielerZahl) == -1 || (getComputerZahl() - spielerZahl) == 1) {
            this.rundenErgebnis = 5;
        }
        else {
            this.rundenErgebnis = -10;
        }

        this.gesamtPunkte = this.getGesamtPunkte() + this.rundenErgebnis;
    }

    public boolean hatGewonnen() {
        return gesamtPunkte >= 100;
    }

    public boolean hatVerloren() {
        return gesamtPunkte <= 0;
    }
}

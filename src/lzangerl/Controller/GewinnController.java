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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new GewinnController();
    }
}

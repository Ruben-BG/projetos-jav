package _04LayoutTest;

import javax.swing.*;

public class MensagemBasica {

    public MensagemBasica() {

        JFrame frameDeMensgaem = new JFrame();
        frameDeMensgaem.setSize(100, 100);
        frameDeMensgaem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel basicBass = new JPanel();
        JLabel mnsgm000 = new JLabel("ola");
        basicBass.add(mnsgm000);
        frameDeMensgaem.setContentPane(basicBass);
        frameDeMensgaem.pack();
        frameDeMensgaem.setVisible(true);

    }

}

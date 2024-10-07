package com.example.SistemaDeVendas.Front;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel MainScreen;
    private JButton button1;

    public JPanel getMainScreen() {
        return MainScreen;
    }

    public JButton getButton1() {
        return button1;
    }

    public App() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hello World");
        }
    });


}
}

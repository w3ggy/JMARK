package com.jmark.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Artyom on 07.04.2016.
 */
public class MainWindow extends JFrame implements ActionListener{



    public MainWindow() {

        super("J-Mark System Configurator");
        JPanel mainPanel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton start = new JButton("Start");
        start.addActionListener(this);
        mainPanel.add(start);
        setContentPane(mainPanel);
        setVisible(true);
        setSize(new Dimension(500, 500));
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Start":
                System.out.println("Starting!");
                break;
            default:
                break;
        }
    }
}

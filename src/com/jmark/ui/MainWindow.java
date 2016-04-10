package com.jmark.ui;

import com.jmark.utils.FindComponentName;

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
        JButton stop = new JButton("Stop");

        start.setName("start");
        stop.setName("stop");

        System.out.println("Как же??? " + FindComponentName.getComponentVariableName(start));


        start.addActionListener(this);
        mainPanel.add(start);
        mainPanel.add(stop);
        setContentPane(mainPanel);
        setVisible(true);
        setFocusable(true);
        setSize(new Dimension(500, 500));


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

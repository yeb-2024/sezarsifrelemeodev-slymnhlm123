package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener
{
    JFrame frame = new JFrame();

    JPanel panelüst = new JPanel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    JPanel panelalt = new JPanel();
    JButton button1 = new JButton("Şifrelemek mi?");
    JButton button2 = new JButton("Şifre Çözmek mi?");


    public AnaSayfa()
    {
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(500, 500);
        frame.setTitle("Sezar Şifreleme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1.setText("SEZAR ŞİFRELEME");
        label1.setFont(new Font("Arial", Font.PLAIN, 25));
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);

        label2.setText("Şifrelemek mi?");
        label2.setFont(new Font("Arial", Font.PLAIN, 15));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);

        label3.setText("Şifre Çözmek mi?");
        label3.setFont(new Font("Arial", Font.PLAIN, 15));
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setVerticalAlignment(JLabel.CENTER);

        panelüst.setLayout(new GridLayout(3, 1));
        panelüst.setPreferredSize(new Dimension(500, 250));

        panelalt.setLayout(new GridLayout(1, 2));
        panelalt.setPreferredSize(new Dimension(500, 250));

        panelüst.add(label1);
        panelüst.add(label2);
        panelüst.add(label3);
        button1.addActionListener(this);
        button2.addActionListener(this);

        panelalt.add(button1);
        panelalt.add(button2);

        frame.add(panelüst);
        frame.add(panelalt);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
        {
            Sifrelemek şifre = new Sifrelemek();
            frame.dispose();

        } else if (e.getSource() == button2)
        {
            SifreÇözmek çözzmek = new SifreÇözmek();
            frame.dispose();

        }

    }

}

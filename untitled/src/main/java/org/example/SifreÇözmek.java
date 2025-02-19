package org.example;

import javax.swing.*;
import java.awt.*;

public class SifreÇözmek
{
    JFrame frame = new JFrame("Şifreleme");
    JTextField mesaj = new JTextField();
    JTextField şifresayısı = new JTextField();
    JButton gönder = new JButton("Gönder");
    JButton geri = new JButton("Geri");

    String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public SifreÇözmek() {
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gönder.addActionListener(this);
        geri.addActionListener(this);

        frame.add(new JLabel("Mesaj:"));
        frame.add(mesaj);
        frame.add(new JLabel("Şifre Anahtarı (0-25):"));
        frame.add(şifresayısı);
        frame.add(gönder);
        frame.add(geri);


        frame.setVisible(true);
}

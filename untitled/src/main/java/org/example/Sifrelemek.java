package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sifrelemek implements ActionListener {
    JFrame frame = new JFrame("Şifreleme");
    JTextField mesaj = new JTextField();
    JTextField şifresayısı = new JTextField();
    JButton gönder = new JButton("Gönder");
    JButton geri = new JButton("Geri");

    String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Sifrelemek() {
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gönder) {
            String getmesaj = mesaj.getText().toUpperCase();
            int  getkey = Integer.parseInt(şifresayısı.getText());;

            try {
                if (getkey < 0 || getkey > 25) {
                    JOptionPane.showMessageDialog(null, "Lütfen 0-25 arasında bir anahtar giriniz!");
                    return;
                }
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Geçerli bir sayı giriniz!");
                return;
            }

            String sifrelenmismesaj = caesarEncrypt(getmesaj, getkey);
            JOptionPane.showMessageDialog(null,"Şifrelenmiş Mesaj : "+ sifrelenmismesaj,"Bilgi",JOptionPane.INFORMATION_MESSAGE);


        } else if (e.getSource() == geri)
        {
            AnaSayfa sayfa = new AnaSayfa();
            frame.dispose();

        }
    }

    public String caesarEncrypt(String message, int key) {
        String encrypted = "";

        for (char karakter : message.toCharArray()) {
            if (SYMBOLS.indexOf(karakter) != -1) {
                int newIndex = (SYMBOLS.indexOf(karakter) + key) % 26;
                encrypted += SYMBOLS.charAt(newIndex);
            } else {
                encrypted += karakter;
            }
        }
        return encrypted;
    }




}

package olfuqc;

import java.awt.*;
import javax.swing.*;

public class Untitled extends Canvas {

  public void paint(Graphics pencil) {
    pencil.setColor(Color.BLACK);
    pencil.setFont(new Font("SF Pro Display", Font.PLAIN, 16));
    pencil.drawString("OOPR212", 128, 128);

    pencil.drawOval(30, 50, 100, 100);
    pencil.fillOval(30, 50, 100, 100);

    pencil.drawRoundRect(80, 50, 50, 50, 50, 50);
    pencil.setColor(Color.RED);
    pencil.fillRoundRect(80, 50, 50, 50, 50, 50);

    pencil.setColor(Color.DARK_GRAY);
    pencil.fill3DRect(16, 16, 64, 64, true);

    pencil.drawArc(32, 32, 128, 128, 0, 60);
    pencil.setColor(Color.DARK_GRAY);
    pencil.fillArc(32, 32, 128, 128, 0, 60);
  }

  public static void main(String[] args) {
    Untitled untitled = new Untitled();
    JFrame frame = new JFrame("Title");

    frame.add(untitled);
    frame.setSize(500, 500);
    frame.setVisible(true);
  }
}

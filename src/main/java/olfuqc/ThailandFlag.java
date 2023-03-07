package olfuqc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ThailandFlag extends Canvas {

  public static void main(String[] args) {
    // Instances
    ThailandFlag thailandFlag = new ThailandFlag();
    JFrame frame = new JFrame();

    frame.add(thailandFlag); // Add `thailandFlag` to the `frame`
    frame.setTitle("Thailand's National Flag"); // Create JFrame title
    frame.setSize(900, 600); // Set size
    frame.setVisible(true); // Set visibility
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
  }

  public void paint(Graphics pencil) {
    int[][] customColors = {
      { 165, 25, 49 }, // Custom Red color
      { 244, 245, 248 }, // Custom White color
      { 44, 42, 74 }, // Custom Blue color
    };

    for (int i = 0; i < 3; i += 1) {
      pencil.setColor(new Color(customColors[i][0], customColors[i][1], customColors[i][2]));
      pencil.fillRect(0, 100 * i, 900, 600 - (i * 200));
    }
  }
}

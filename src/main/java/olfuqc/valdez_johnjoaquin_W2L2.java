package olfuqc;

import javax.swing.JOptionPane;

public class valdez_johnjoaquin_W2L2 extends JOptionPane {

  public static void main(String[] args) {
    // Prompts the user to enter their username
    String username = showInputDialog(
      null, // Parent component
      "Please enter your name", // Message of the dialog
      "Welcome", // Title of the dialog
      PLAIN_MESSAGE // Icon of the dialog
    );

    // Checks if the user entered their username
    if (username.length() == 0) {
      showMessageDialog(
        null, // Parent component
        "You did not enter your name.", // Message of the dialog
        "Username cannot be empty", // Title of the dialog
        ERROR_MESSAGE // Icon of the dialog
      );
    }
    // Shows an error message if the user didn't their username
    else {
      showMessageDialog(
        null, // Parent component
        "Hello, " + username + "!", // Message of the dialog
        "Welcome", // Title of the dialog
        INFORMATION_MESSAGE // Icon of the dialog
      );
    }
  }
}

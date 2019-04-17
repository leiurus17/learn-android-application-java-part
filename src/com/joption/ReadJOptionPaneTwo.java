package com.joption;

import javax.swing.*;

public class ReadJOptionPaneTwo {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        String input;

        input = JOptionPane.showInputDialog("Please enter the first number: ");
        firstNumber = Integer.parseInt(input);
        // firstNumber = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Please enter the second number: ");
        secondNumber = Integer.parseInt(input);

        double average = (firstNumber + secondNumber) / 2.0;

        JOptionPane.showMessageDialog(null, "The average is: " + average);
    }
}

package com.decisions;

import javax.swing.*;

public class DecisionStructuresTwo {

    public static void main(String[] args) {
        int number;

        String input;

        input = JOptionPane.showInputDialog("Please enter a number: ");
        number = Integer.parseInt(input);

        if (number == 5) {
            JOptionPane.showMessageDialog(null, "The number is exactly 5!");
        }

        if (number > 5) {
            JOptionPane.showMessageDialog(null, "The number is greater than 5!");
        }

        if (number > 10) {
            JOptionPane.showMessageDialog(null, "The number is greater than 10!");
        }

        System.exit(0);
    }
}

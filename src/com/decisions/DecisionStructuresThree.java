package com.decisions;

import javax.swing.*;

public class DecisionStructuresThree {

    public static void main(String[] args) {
        int mark;

        String input;

        input = JOptionPane.showInputDialog("Please enter your mark: ");
        mark = Integer.parseInt(input);

        if (mark < 50) {

            if (mark >= 45) {
                JOptionPane.showMessageDialog(null, "You can write re-assessment!");
            } else {
                JOptionPane.showMessageDialog(null, "You failed!");

            }
        } else { // The user passed

            if (mark >= 75) {
                JOptionPane.showMessageDialog(null, "You have a distinction!");
            } else {
                JOptionPane.showMessageDialog(null, "You passed!");
            }
        }


        System.exit(0);
    }
}

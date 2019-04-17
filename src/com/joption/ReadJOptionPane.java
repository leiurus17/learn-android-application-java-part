package com.joption;

import javax.swing.*;

public class ReadJOptionPane {

    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        surname = JOptionPane.showInputDialog("Please enter your surname: ");

        System.out.println(name + " " + surname);

        JOptionPane.showMessageDialog(null, name + " " + surname);
    }
}

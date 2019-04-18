package com.compare;

import javax.swing.*;

public class CompareStrings {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please enter name 1: ");
        String name2 = JOptionPane.showInputDialog("Please enter name 2: ");

        if (name1.equals(name2)) {
            System.out.println("name 1 is equals to name 2");
        } else {
            System.out.println("Not the same!");
        }
    }
}

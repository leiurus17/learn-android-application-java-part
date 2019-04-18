package com.compare;

import javax.swing.*;

public class CompareStringsCompareTo {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please enter name 1: ");
        String name2 = JOptionPane.showInputDialog("Please enter name 2: ");

        if (name1.compareTo(name2) == 0) {
            System.out.println("name 1 is equals to name 2");
        }

        if (name1.compareTo(name2) < 0) {
            System.out.println("name 1 is first and name 2 is second");
        }

        if (name1.compareTo(name2) > 0) {
            System.out.println("name 2 is first and name 1 is second");
        }

        System.exit(0);
    }
}

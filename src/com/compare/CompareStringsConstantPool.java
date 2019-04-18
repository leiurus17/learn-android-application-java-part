package com.compare;

import javax.swing.*;

public class CompareStringsConstantPool {

    public static void main(String[] args) {
        String name1 = "Peter";
        String name2 = "Peter";

        if (name1 == name2) { // Same String Literals, Same Memory Location
            System.out.println("The same!");
        } else {
            System.out.println("Not the same!");
        }
    }
}

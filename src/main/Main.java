package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        DefaultListModel<String> l =new DefaultListModel<>();
        l.addElement("Java");
        l.addElement("JS");
        l.addElement("Python");
        l.addElement("PHP");


        JList<String> list=new JList<>(l);
        list.setBounds(100,100,75,75);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(list);
    }
}

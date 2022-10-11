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

        DefaultListModel<String>l2=new DefaultListModel<>();
        l2.addElement("Swing");
        l2.addElement("Laravel");
        l2.addElement("VueJS");
        l2.addElement("Bootstrap");

        JList<String> list2=new JList<>(l2);
        list2.setBounds(100,200,75,85);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(list);
        frame.add(list2);
    }
}

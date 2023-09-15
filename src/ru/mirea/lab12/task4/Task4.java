package ru.mirea.lab12.task4;

import javax.swing.*;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(509, 604);
        JLabel pic = new JLabel();
        frame.add(pic);
        frame.setVisible(true);

        for (int i = 0; ; i = (i + 1) % 12) {
            ImageIcon imageIcon = new ImageIcon("C:\\InteliJProjects\\MIREAProjects\\Lab1\\src\\ru\\mirea\\lab12\\task4\\resources\\" + (i + 1) + ".png");
            pic.setIcon(imageIcon);
            pic.repaint();
            Thread.sleep(150);
        }
    }
}

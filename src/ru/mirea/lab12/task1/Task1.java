package ru.mirea.lab12.task1;

import javax.swing.*;
import java.awt.*;

public class Task1 {
    public static void main(String[] args) {
        final int[] milanScore = {0};
        final int[] madridScore = {0};
        JFrame frame = new JFrame("Milan vs Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(920, 640);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 200));
        JLabel label1 = new JLabel(
                "Result " + milanScore[0] +
                        " X " + madridScore[0], JLabel.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel label3 = new JLabel("Winner DRAW", JLabel.CENTER);
        JButton button1 = new JButton("AC Milan");
        button1.addActionListener(e -> {
            label1.setText("Result " + ++milanScore[0] + " X " + madridScore[0]);
            label2.setText("Last Scorer: Milan");
            if (madridScore[0] < milanScore[0]) {
                label3.setText("Winner Milan");
            } else if (madridScore[0] == milanScore[0]) {
                label3.setText("Winner Draw");
            }
        });
        JButton button2 = new JButton("Real Madrid");
        button2.addActionListener(e -> {
            label1.setText("Result " + milanScore[0] + " X " + ++madridScore[0]);
            label2.setText("Last Scorer: Real Madrid");
            if (madridScore[0] > milanScore[0]) {
                label3.setText("Winner Real Madrid");
            } else if (madridScore[0] == milanScore[0]) {
                label3.setText("Winner Draw");
            }
        });
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.getContentPane().
                add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}

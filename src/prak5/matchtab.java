package prak5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.TextAction;

public class matchtab
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel panel= new JPanel();
        panel.setPreferredSize( new Dimension(400,400));
        int a = 0, b = 0;
        JButton button1 = new JButton("AC Milan");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0;
                a++;
            }
        });

        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);

        JLabel label1 = new JLabel("Result: " + a + "X" + b, JLabel.LEADING);
        panel.add(label1);
        JLabel label2 = new JLabel("Last Scorer: N/A", JLabel.RIGHT);
        panel.add(label2);
        JLabel label3 = new JLabel("Winner: DRAW", JLabel.LEFT);
        panel.add(label3);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}

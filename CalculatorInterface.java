import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorInterface {
    public static void createAndShowGUI() {
        JFrame jf = new JFrame("Calculator");
        jf.setLocationRelativeTo(null);
        jf.setPreferredSize(new Dimension(320, 200));
        jf.setResizable(false);
        jf.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        ActionListener myActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button = "+e.getActionCommand());
            }
        };

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        JTextField jb = new JTextField("0");
        jb.setFont(new Font("Arial", Font.BOLD,13));
        jb.setHorizontalAlignment(SwingConstants.RIGHT);
        jb.setEnabled(false);
        jf.getContentPane().add(jb, gbc);

        gbc.gridwidth = 1;

        String cyfry_i_znaki[] = new String[]
                {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "=", "C", "/"};

        int a = 0;
        for (int i=1; i<5;i++){
            for (int j=0; j<4;j++){
                gbc.gridy = i;
                gbc.gridx = j;
                JButton jbu = new JButton(cyfry_i_znaki[a]);
                jbu.addActionListener(myActionListener);
                jf.getContentPane().add(jbu, gbc);
                a++;
            }
        }

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });
    }

}
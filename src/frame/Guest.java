package frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;

public class Guest extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Guest() {
        setResizable(false);
        setForeground(new Color(255, 105, 180));
        setBackground(new Color(255, 105, 180));
        setTitle("ChatApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("ChatApp");
        lblNewLabel.setFont(new Font("Tekton Pro", Font.PLAIN, 30));
        lblNewLabel.setBounds(30, 10, 120, 39);
        contentPane.add(lblNewLabel);

        JButton btnGoToLogin = new JButton("\u0110\u0102NG NH\u1EACP");
        
        btnGoToLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Login login_frame = new Login();
                login_frame.setVisible(true);
                dispose();
            }
        });
        btnGoToLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGoToLogin.setFocusable(false);
        btnGoToLogin.setForeground(Color.WHITE);
        btnGoToLogin.setBackground(Color.GREEN);
        btnGoToLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGoToLogin.setBounds(47, 75, 341, 46);
        contentPane.add(btnGoToLogin);

        JButton btnGoToRegister = new JButton("\u0110\u0102NG K\u00DD");
        btnGoToRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Register register_frame = new Register();
                register_frame.setVisible(true);
                dispose();
            }
        });
        btnGoToRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGoToRegister.setFocusable(false);
        btnGoToRegister.setBackground(Color.BLUE);
        btnGoToRegister.setForeground(Color.WHITE);
        btnGoToRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGoToRegister.setBounds(47, 137, 341, 46);
        contentPane.add(btnGoToRegister);

    }

    private static class RoundedBorder implements Border {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
}


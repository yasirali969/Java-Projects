import javax.swing.*;
import java.awt.event.*;

// ===== MAIN CLASS =====
public class Way2 extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    Way2() {

        setTitle("Calculator - Way 2");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");

        t1.setBounds(50, 50, 150, 30);
        t2.setBounds(50, 100, 150, 30);
        t3.setBounds(50, 150, 150, 30);

        b1.setBounds(220, 50, 80, 30);
        b2.setBounds(220, 90, 80, 30);
        b3.setBounds(220, 130, 80, 30);
        b4.setBounds(220, 170, 80, 30);

        // Register buttons with event handler
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // ===== EVENT HANDLING METHOD =====
    public void actionPerformed(ActionEvent e) {

        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int result = 0;

            String cmd = e.getActionCommand();

            if (cmd.equals("Add"))
                result = a + b;

            else if (cmd.equals("Sub"))
                result = a - b;

            else if (cmd.equals("Mul"))
                result = a * b;

            else if (cmd.equals("Div"))
                result = a / b;

            t3.setText(String.valueOf(result));

        } catch (Exception ex) {
            t3.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Way2();
    }
}

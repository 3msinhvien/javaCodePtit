import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final JTextField display;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(350, 500); // Adjusted size for a more compact look
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 32));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setPreferredSize(new Dimension(350, 80));
        add(display, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // 5 rows x 4 columns with padding

        String[] buttons = {
                "MC", "MR", "M+", "M-",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.setPreferredSize(new Dimension(80, 80)); // Fixed button size
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Number and decimal point input
        if (command.matches("[0-9]") || command.equals(".")) {
            display.setText(display.getText() + command);
        }

        // Operators
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);
            display.setText("");
        }

        // Equals button
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num2 != 0 ? num1 / num2 : 0; // Avoid division by zero
            }
            display.setText(String.valueOf(result));
            num1 = result;  // Allow chain calculations
        }

        // Clear button
        else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = '\0';
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}

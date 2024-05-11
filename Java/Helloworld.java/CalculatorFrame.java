import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        // Tạo panel chính để chứa các thành phần
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(3, 2, 5, 5)); // Sử dụng GridLayout

        // Thêm các thành phần
        JLabel label1 = new JLabel("Số thứ nhất:");
        JTextField firstNumberField = new JTextField(10);
        JLabel label2 = new JLabel("Số thứ hai:");
        JTextField secondNumberField = new JTextField(10);
        JButton addButton = new JButton("Cộng");
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Thêm các thành phần vào panel
        panel.add(label1);
        panel.add(firstNumberField);
        panel.add(label2);
        panel.add(secondNumberField);
        panel.add(addButton);
        panel.add(resultLabel);

        // Thêm hành động cho nút cộng
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(firstNumberField.getText());
                    int num2 = Integer.parseInt(secondNumberField.getText());
                    int result = num1 + num2;
                    resultLabel.setText("Kết quả: " + result);
                } catch (NumberFormatException nfe) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new CalculatorFrame().setVisible(true);
    }
}

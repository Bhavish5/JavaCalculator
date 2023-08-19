import javax.swing.*;
import java.awt.event.*;
public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Calculator");
        
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(10, 10, 100, 30);
        frame.add(label1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(10, 40, 100, 30);
        frame.add(label2);

        JTextField textfield1 = new JTextField();
        textfield1.setBounds(110, 10, 200, 30);
        frame.add(textfield1);

        JTextField textfield2 = new JTextField();
        textfield2.setBounds(110, 40, 200, 30);
        frame.add(textfield2);

        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 100, 80, 30);
        frame.add(addButton);  
        
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int num1 = 0, num2 = 0, res = 0;
                try{
                    num1 = Integer.parseInt(textfield1.getText());
                    num2 = Integer.parseInt(textfield2.getText());
                    res = num1+num2;
                    JOptionPane.showMessageDialog(null, "The sum is "+res+".");
                }
                catch(NumberFormatException e1){
                    JOptionPane.showMessageDialog(null, "Please Enter valid Input!");
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(150, 100, 80, 30);
        frame.add(clearButton);
        
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textfield1.setText("");
                textfield2.setText("");
            }
        });

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

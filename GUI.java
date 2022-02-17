import javax.swing.*;
import java.awt.*;
//Reese Hatfield
//Justin Do

public class GUI {
    public static void main(String[] args) {
        new GUI();
    }
    public GUI(){
        JFrame frame = new JFrame("Check Please");

        JPanel root = new JPanel();

        JLabel totalLabel = new JLabel("Total: ");
        root.add(totalLabel);
        totalLabel.setBounds(1,1, 100, 10);

        JTextField totalTF = new JTextField();
        root.add(totalTF);
        totalTF.setBounds(1, 10, 300,30);

        JLabel tipPercentageLabel = new JLabel("Tip Percentage: ");
        root.add(tipPercentageLabel);
        tipPercentageLabel.setBounds(1,40, 100, 20);

        JTextField tipPercentageTF = new JTextField();
        root.add(tipPercentageTF);
        tipPercentageTF.setBounds(1, 60, 300,30);

        JLabel numPeopleLabel = new JLabel("Number of People: ");
        root.add(numPeopleLabel);
        numPeopleLabel.setBounds(1,90, 1000, 20);

        JTextField numPeopleTF = new JTextField();
        root.add(numPeopleTF);
        numPeopleTF.setBounds(1, 110, 300,30);

        JLabel message = new JLabel("Each Person Pays: ");
        root.add(message);
        message.setBounds(1, 130, 300, 30);

        JLabel output =new JLabel();
        root.add(output);
        output.setBounds(1, 145, 300, 30);

        JButton button = new JButton("Calculate");
        root.add(button);
        button.addActionListener(e -> {
            try {
                double totalDouble = Double.parseDouble(totalTF.getText());
                double tipPercentDouble = Double.parseDouble(tipPercentageTF.getText());
                int numPeopleInt = Integer.parseInt(numPeopleTF.getText());
                output.setText(String.format("%.2f", (totalDouble * (1 + (tipPercentDouble / 100))) / numPeopleInt));
            } catch (Exception r){
                output.setText("One of more of your inputs are invalid");
            }
        });
        button.setBounds(1, 170, 100, 50);

        root.setLayout(null);
        frame.getContentPane().add(root);
        frame.setSize(300,245);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

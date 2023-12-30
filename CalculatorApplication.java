import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplication implements ActionListener {
    // variable declaration
    double num1 = 0, num2 = 0, result = 0;
    int calculation;
    // creating objects
    JFrame frame = new JFrame("My Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("Clear");
    JButton buttonDelete = new JButton("Delete");
    JButton buttonEquals = new JButton("=");
    JButton buttonMultiply = new JButton("x");
    JButton buttonDivide = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x²");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("√");



    // creating constructor
    CalculatorApplication() {
        prepareGui();
        addComponents();
        addActionEvent();
    }
    // method which prepares the user´s interface
    public void prepareGui() {
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(new Color(247, 220, 232));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // adds all components to the frame
    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);
        textField.setBounds(10, 40, 270, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 23));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonSeven.setBounds(10, 230,60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230,60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230,60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290,60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290,60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290,60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350,60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350,60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350,60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410,60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410,130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEquals.setBounds(220, 350,60, 100);
        buttonEquals.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEquals.setBackground(new Color(173, 106, 135));
        frame.add(buttonEquals);

        buttonDivide.setBounds(220, 110,60, 40);
        buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDivide.setBackground(new Color(173, 106, 135));
        frame.add(buttonDivide);

        buttonSqrt.setBounds(10, 170,60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(new Color(173, 106, 135));
        frame.add(buttonSqrt);

        buttonMultiply.setBounds(220, 230,60, 40);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMultiply.setBackground(new Color(173, 106, 135));
        frame.add(buttonMultiply);

        buttonMinus.setBounds(220, 170,60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(173, 106, 135));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290,60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(173, 106, 135));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170,60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(new Color(173, 106, 135));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170,60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(new Color(173, 106, 135));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(120, 110,90, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonDelete);

        buttonClear.setBounds(10, 110,100, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        frame.add(buttonClear);
    }
    // adds the action event
    public void addActionEvent() {
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSqrt.addActionListener(this);


    }
    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();
    }
    // adds the functionality for each button
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == buttonClear) {
            label.setText("");
            textField.setText("");
        }else if(source == buttonDelete) {
            int length = textField.getText().length();
            int numIndex = length - 1;
            if (length > 0) {
                StringBuilder oneBack = new StringBuilder(textField.getText());
                oneBack.deleteCharAt(numIndex);
                textField.setText(oneBack.toString());
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {textField.setText(textField.getText() + "0");}
        } else if (source == buttonOne) {
             textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else{textField.setText(textField.getText() + ".");}
        } else if (source == buttonPlus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        } else if (source == buttonMinus) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str + "-");
        } else if (source == buttonMultiply) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str + "x");
        } else if (source == buttonDivide) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str + "/");
        } else if (source == buttonSquare) {
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String stringResult = Double.toString(square);
            if (stringResult.endsWith(".0")) {
                textField.setText(stringResult.replace(".0", ""));
            } else {textField.setText(stringResult);}
        } else if (source == buttonSqrt) {
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            String stringResult = Double.toString(sqrt);
            if (stringResult.endsWith(".0")) {
                textField.setText(stringResult.replace(".0", ""));
            } else {textField.setText(stringResult);}
        } else if (source == buttonReciprocal) {
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1 / num1;
            String stringResult = Double.toString(reciprocal);
            if (stringResult.endsWith(".0")) {
                textField.setText(stringResult.replace(".0", ""));
            } else {textField.setText(stringResult);}
        } else if (source == buttonEquals) {
            num2 = Double.parseDouble(textField.getText());
            switch (calculation) {
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 - num2;
                case 3 -> result = num1 * num2;
                case 4 -> result = num1 / num2;
            } if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {textField.setText(Double.toString(result));}
            label.setText("");
            num1 = result;
        }
    }
}
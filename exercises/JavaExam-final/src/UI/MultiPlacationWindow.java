package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import Class.MultiPlacation;

public class MultiPlacationWindow extends JFrame implements WindowListener
{
    private Container controlpane;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextArea label5;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private MainWindow mw;

    MultiPlacationWindow(String title, MainWindow mw)
    {
        super(title);
        setBounds(383, 184, 600, 400);
        setVisible(true);
        addWindowListener(this);
        controlpane = getContentPane();
        controlpane.setLayout(null);
        addLabel();
        addTextField();
        addButton();
        this.mw = mw;
    }

    public void addLabel()
    {
        String Dot = "";
        for(int i = 0 ; i < 200 ; i++)
            Dot += ".";

        label1 = new JLabel("MultiPlacationWindow Programm");
        label2 = new JLabel(Dot);
        label3 = new JLabel("MinBound : ");
        label4 = new JLabel("MaxBound : ");
        label5 = new JTextArea("");

        label1.setBounds(10, 10, 560, 20);
        label2.setBounds(10, 30, 560, 20);
        label3.setBounds(10, 60, 560, 20);
        label4.setBounds(10, 90, 560, 20);
        label5.setBounds(10, 160, 560, 100);
        label5.setEditable(false);

        controlpane.add(label1);
        controlpane.add(label2);
        controlpane.add(label3);
        controlpane.add(label4);
        controlpane.add(label5);
    }
    public void addTextField()
    {
        textField1 = new JTextField();
        textField2 = new JTextField();

        textField1.setBounds(100, 60, 200, 20);
        textField2.setBounds(100, 90, 200, 20);

        controlpane.add(textField1);
        controlpane.add(textField2);

    }
    public void addButton()
    {
        button1 = new JButton("Run");
        button2 = new JButton("Back");

        button1.setBounds(10, 120, 100, 30);
        button2.setBounds(120, 120, 100, 30);

        button1.addActionListener(new ActionListeners());
        button2.addActionListener(new ActionListeners());

        controlpane.add(button1);
        controlpane.add(button2);
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public class ActionListeners implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String command = e.getActionCommand();
            switch(command)
            {
                case "Run" :
                {
                    int number1 = Integer.valueOf(textField1.getText());
                    int number2 = Integer.valueOf(textField2.getText());
                    MultiPlacation multiPlacation = new MultiPlacation(number1, number2);
                    label5.setText(multiPlacation.Calculator());
                } break;
                case "Back" :
                {
                    mw.setVisible(true);
                    setVisible(false);
                } break;
            }
        }
    }
}

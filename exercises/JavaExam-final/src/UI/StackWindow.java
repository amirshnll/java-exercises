package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class StackWindow extends JFrame implements WindowListener
{
    private MainWindow mw;
    private Container controlpane;
    private JLabel label1;
    private JTextArea label2;
    private JTextField textField1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;

    public StackWindow(String title,MainWindow mw)
    {
        super(title);
        setBounds(383, 184, 600, 400);
        setVisible(true);
        addWindowListener(this);
        controlpane = getContentPane();
        controlpane.setLayout(null);
        this.mw = mw;
        addLabel();
        addButton();
        addTextField();
    }

    public void addLabel()
    {
        label1 = new JLabel("Value For Add : ");
        label2 = new JTextArea("");

        label1.setBounds(10, 10, 560, 30);
        label2.setBounds(10, 50, 560, 100);

        controlpane.add(label1);
        controlpane.add(label2);
    }

    public void addTextField()
    {
        textField1 = new JTextField();

        textField1.setBounds(100, 10, 200, 30);

        controlpane.add(textField1);
    }

    public void addButton()
    {
        jButton1 = new JButton("Push");
        jButton2 = new JButton("Pop");
        jButton3 = new JButton("Top");
        jButton4 = new JButton("Back");

        jButton1.setBounds(10, 160, 100, 30);
        jButton2.setBounds(120, 160, 100, 30);
        jButton3.setBounds(230, 160, 100, 30);
        jButton4.setBounds(340, 160, 100, 30);

        controlpane.add(jButton1);
        controlpane.add(jButton2);
        controlpane.add(jButton3);
        controlpane.add(jButton4);
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}

    public class ActionListeners implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {

        }
    }
}

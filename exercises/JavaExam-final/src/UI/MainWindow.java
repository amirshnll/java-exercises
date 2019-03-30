package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends JFrame implements WindowListener
{
    private Container controlpane;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public MainWindow(String title)
    {
        super(title);
        setBounds(383, 184, 600, 400);
        setVisible(true);
        addWindowListener(this);
        controlpane = getContentPane();
        controlpane.setLayout(null);
        addLabel();
        addButton();
    }

    private void addLabel()
    {
        String Dot = "";
        for(int i = 0 ; i < 200 ; i++)
            Dot += ".";

        label1 = new JLabel("Welcome My App - Please Enter Command For Run Application");
        label2 = new JLabel(Dot);

        label1.setBounds(10, 10, 560, 20);
        label2.setBounds(10, 30, 560, 20);

        controlpane.add(label1);
        controlpane.add(label2);
    }

    private void addButton()
    {
        int i = 1;
        button1 = new JButton("Question" + (i++));
        button2 = new JButton("Question" + (i++));
        button3 = new JButton("Question" + (i++));
        button4 = new JButton("Question" + (i++));

        button1.setBounds(10, 60, 100, 30);
        button2.setBounds(10, 100, 100, 30);
        button3.setBounds(10, 140, 100, 30);
        button4.setBounds(10, 180, 100, 30);

        button1.addActionListener(new ActionListeners());
        button2.addActionListener(new ActionListeners());
        button3.addActionListener(new ActionListeners());
        button4.addActionListener(new ActionListeners());

        controlpane.add(button1);
        controlpane.add(button2);
        controlpane.add(button3);
        controlpane.add(button4);
    }
    private void ViewMultiPlacationWindow()
    {
        MultiPlacationWindow multiPlacationWindow = new MultiPlacationWindow("MultiPlacationWindow", this);
    }

    public void viewInstanceWelcomeWindow()
    {
        InstanceWelcomeWindow instanceWelcomeWindow = new InstanceWelcomeWindow();
    }

    public void viewFinalizeClassWindow()
    {
        FinalizeWindow finalizeWindow = new FinalizeWindow();
    }

    public void viewStackWindow()
    {
        StackWindow stackWindow = new StackWindow("StackWindow", this);
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
                case "Question1" :
                {
                    ViewMultiPlacationWindow();
                    setVisible(false);
                } break;
                case "Question2" :
                {
                    viewInstanceWelcomeWindow();
                } break;
                case "Question3" :
                {
                    viewFinalizeClassWindow();
                } break;
                case "Question4" :
                {
                    viewStackWindow();
                } break;
            }
        }
    }
}

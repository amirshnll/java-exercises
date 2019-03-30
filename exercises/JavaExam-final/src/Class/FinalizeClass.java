package Class;
import javax.swing.*;

public class FinalizeClass
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        JOptionPane.showMessageDialog(null, "GoodBye...!! \r\n I am 'FinalizeClass'.");
    }
}

package UI;
import Class.FinalizeClass;

public class FinalizeWindow
{
    FinalizeWindow()
    {
        FinalizeClass finalizeClass = new FinalizeClass();
        finalizeClass = null;
        System.gc();
    }
}

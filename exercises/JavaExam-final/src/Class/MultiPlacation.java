package Class;

public class MultiPlacation
{
    int minBound;
    int maxBound;

    public MultiPlacation(int number1, int number2)
    {
        setMinBound(number1);
        setMaxBound(number2);
    }

    public String Calculator()
    {
        String result = "";
        for(int i = getMinBound(); i <= getMaxBound() ; i++)
        {
            result += "(";
            for (int j = 1; j <= 10; j++)
            {
                result += (i * j) + " ";
            }
            result += ")" + "\r\n";
        }
        return result;
    }

    public void setMinBound(int minBound)
    {
        this.minBound = minBound;
    }
    public int getMinBound()
    {
        return minBound;
    }
    public void setMaxBound(int maxBound)
    {
        this.maxBound = maxBound;
    }
    public int getMaxBound()
    {
        return maxBound;
    }

}

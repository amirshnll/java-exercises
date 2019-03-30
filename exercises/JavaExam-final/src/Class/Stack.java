package Class;

public class Stack
{
    int Capacity;
    int index;
    int[] arr;
    public Stack(int capacity)
    {
        setCapacity(capacity++);
        arr = new int[getCapacity()];
        index = getCapacity();
    }

    public int pop()
    {
        if(getCapacity() != index)
        {
            index++;
            return arr[index];
        }
        return 0;
    }
    public void push(int value)
    {
        if(arr.length <= getCapacity())
        {
            arr[index] = value;
            index--;
        }
    }

    public int top()
    {
        return arr[index];
    }

    private void setCapacity(int Capacity)
    {
        this.Capacity = Capacity;
    }
    private int getCapacity()
    {
        return Capacity;
    }
}

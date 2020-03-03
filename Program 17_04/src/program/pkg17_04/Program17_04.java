package program.pkg17_04;

public class Program17_04 
{
    public static void main(String[] args) 
    {
        Program17_04 tester = new Program17_04();
    }
    
    public Program17_04()
    {
        int[] x = new int[5];
        x[0] = 0;
        x[1] = 1;
        x[2] = 2;
        x[3] = 3;
        x[4] = 4;
        
        writeArrayBackward(x);
    }
    
    public void writeArrayBackward(int[] x)
    {
        writeArrayBackwardRec(x, x.length - 1);
    }
    
    public void writeArrayBackwardRec(int[] x, int pos)
    {
        System.out.print(x[pos] + " ");
        if (pos != 0)
        {
            writeArrayBackwardRec(x, pos - 1);
        }
        else
        {
            System.out.println();
        }
    }
}
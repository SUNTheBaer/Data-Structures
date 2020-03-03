package program.pkg19_04;

public class Program19_04 
{
    public static void main(String[] args) 
    {
        Program19_04 tester = new Program19_04();
    }
    
    public Program19_04()
    {
        int[] a = new int[2];
        int[] b = new int [3];
        
        b[0] = 1;
        b[1] = 2;
        a[0] = 3;
        a[1] = 4;
        b[2] = 5;
        
        int[] c = merge(a,b);
        
        for (int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
    
    public int[] merge(int[] a, int[] b)
    {
        int[] c = new int[a.length + b.length];
        int acount = 0;
        int bcount = 0;
        int ccount = 0;
        
        while (acount < a.length && bcount < b.length)
        {
            if(a[acount] < b[bcount])
            {
                c[ccount] = a[acount];
                acount++;
            }
            else
            {
                c[ccount] = b[bcount];
                bcount++;
            }
            ccount++;
        }
        
        if (acount < a.length)
        {
            for (int i = acount; i < a.length; i++)
            {
                c[ccount] = a[i];
                ccount++;
            }
        }
        else
        {
            for (int i = bcount; i < b.length; i++)
            {
                c[ccount] = b[i];
                ccount++;
            }
        }
        
        return c;
    }
}

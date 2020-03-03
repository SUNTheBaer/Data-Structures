package program.pkg23_01;

public class Program23_01 
{
    public static void main(String[] args)
    {
        System.out.println(hash("String", 67));
    }
    
    public static int hash (String key, int tableSize)
    {
        int hashVal = 0;
        
        for (int i = 0; i < key.length(); i++)
        {
            hashVal = 37 * hashVal + key.charAt(i);
        }
        
        hashVal %= tableSize;
        if (hashVal < 0)
        {
            hashVal += tableSize;
        }
        
        return hashVal;
    }
}
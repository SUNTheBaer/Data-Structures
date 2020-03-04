package program.pkg29_01;
import java.util.Iterator;
import java.util.LinkedList;

public class Program29_01 {

    public static void main(String[] args) {
        LinkedList<Integer> randomList = new LinkedList<>();
        
        for(int i = 0; i < 10; i++)
        {
            randomList.add((int)(Math.random()*11));
        }
        
        Iterator<Integer> it = randomList.iterator();
        int[] sums = new int[11];
        while(it.hasNext())
        {
            int x = it.next();
            System.out.print(x + " ");
            sums[x] = sums[x] + 1;
        }
        
        System.out.println("");
        
        for(int i = 0; i < sums.length; i++)
        {
            System.out.println("Count of " + i + ": " + sums[i]);
        }
    }
    
}

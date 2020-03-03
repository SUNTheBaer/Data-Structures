package program.pkg22_01;

public class Program22_01 
{
    public static void main(String[] args)
    {
        BinarySearchTree tester = new BinarySearchTree();
        tester.add(5);
        tester.add(2);
        tester.add(7);
        tester.add(10);
        tester.add(11);
        tester.add(12);
        tester.add(1);
        tester.add(8);
        tester.add(9);
        tester.add(7);
        System.out.println(tester.count(25));
    }   
}
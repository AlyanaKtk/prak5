package prak69;

public class Tester
{
    public static void main(String args[])
    {
        printable[] mass = new printable[2];
        mass[0] = new Book();
        mass[1] = new Shop();
        for (int i = 0; i < 2; i++) {
            mass[i].print();
        }
    }

}

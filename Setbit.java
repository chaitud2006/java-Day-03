import java.util.*;
public class Setbit
{
    public static void main(String args[])
    {
        int a=10;
        int pos=1;
        if((a&(1<<pos))!=0)
        {
            System.out.println("set bit");
        }
        else
        {
            System.out.println("Not a set bit");
        }
    }
}
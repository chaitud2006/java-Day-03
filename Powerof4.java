import java.util.*;
public class Powerof4
{
    public static void main(String args[])
    {
        int a=16;
        if((a&(a-2))==0)
        {
            System.out.println("Power of 4");
        }
        else
        {
            System.out.println("Not power of 4");
        }
    }
}
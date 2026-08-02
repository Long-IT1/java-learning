public class Day01
{
    public static void main(String[] args)
    {
        int a = 5;
        System.out.println(a/2);
        double c= 5.0;
        double d = c/2;
        System.out.println(d);
        char e = 'A';
        System.out.println(e+1);
        
        boolean isRaining = true;
        if (isRaining)
        {
            System.out.println("下雨了，带伞");
        }
        else
        {
            System.out.println("没下雨，不用带伞");
        }

        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }

    }
}
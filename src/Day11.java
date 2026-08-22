public class Day11
{
    public static void main(String[] args)
    {
        // try = 试试看，可能有危险的代码放这里
        try
        {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);     // 数组只有3个，访问第5个，出错
            System.out.println("这行不会执行");  // 出错后程序直接跳到 catch
        }
        // catch = 出错了怎么办，接住异常
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组越界了！程序没有崩溃");
        }

        System.out.println("程序继续往下跑");

        // 练习：给除零加 try-catch
        try
        {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("除零错误被接住了！");
        }

        System.out.println("除零处理完，程序还活着");
    }
}

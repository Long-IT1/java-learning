public class Day02
{
    public static void main(String[] args)
    {
        // 1. 找最大值
        int[] ns = {5, 3, 8, 1, 9};
        int max = ns[0];
        for (int i = 1; i < ns.length; i++)
        {
            if (ns[i] > max)
            {
                max = ns[i];
            }
        }
        System.out.println("最大值: " + max);

        // 2. for-each 遍历
        for (int n : ns)
        {
            System.out.println(n);
        }

        // 3. String 比较：== 和 .equals()
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);          // true（同一个常量池对象）
        System.out.println(a.equals(b));     // true（内容相同）

        // 4. 统计字母 'a' 出现次数
        String c = "hello java world";
        int count = 0;
        for (int i = 0; i < c.length(); i++)
        {
            if (c.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println("字母a出现次数: " + count);

        // 5. 反转字符串
        String e = "hello";
        for (int i = e.length() - 1; i >= 0; i--)
        {
            System.out.print(e.charAt(i));
        }
        System.out.println(); // 换行
    }
}

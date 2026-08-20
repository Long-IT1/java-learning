import java.util.ArrayList;

public class Day09
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("张三");
        names.add("李四");
        names.add("王五");

        System.out.println("有几个：" + names.size());
        System.out.println("第0个：" + names.get(0));

        names.remove(1);
        System.out.println("删掉李四后还有几个：" + names.size());
        System.out.println("现在全部：" + names);

        // 用 for 循环遍历
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println("第" + i + "个：" + names.get(i));
        }

        // 用 for-each 遍历
        for (String n : names)
        {
            System.out.println(n);
        }
    }
}



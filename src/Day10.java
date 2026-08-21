import java.util.HashMap;

public class Day10
{
    public static void main(String[] args)
    {
        // 1. 创建一个 HashMap：键是String，值也是String
        HashMap<String, String> phoneBook = new HashMap<>();

        // 2. put：放进去（键, 值）
        phoneBook.put("张三", "13800000001");
        phoneBook.put("李四", "13800000002");
        phoneBook.put("王五", "13800000003");

        // 3. get：按键取值
        System.out.println("张三的电话：" + phoneBook.get("张三"));
        System.out.println("李四的电话：" + phoneBook.get("李四"));

        // 4. 没有这个键 → 得到 null
        System.out.println("赵六的电话：" + phoneBook.get("赵六"));

        // 5. 判断有没有这个键
        System.out.println("有张三吗：" + phoneBook.containsKey("张三"));
        System.out.println("有赵六吗：" + phoneBook.containsKey("赵六"));

        // 6. 删掉一个
        phoneBook.remove("王五");
        System.out.println("删掉王五后：" + phoneBook);

        // 7. 有几个
        System.out.println("一共几个：" + phoneBook.size());
    }
}

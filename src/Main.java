public class Main
{
    public static void main(String[] args)
    {
        Library lib = new Library();

        lib.addBook(new Book("B001", "Java编程思想", "Bruce", false));
        lib.addBook(new Book("B002", "三体", "刘慈欣", true));

        System.out.println("===== 借书测试 =====");

        // 测试1：借一本在馆的书（应该成功）
        try
        {
            lib.borrow("B001");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("借书失败：" + e.getMessage());
        }

        // 测试2：再借一次刚借出的书（应该失败：已被借出）
        try
        {
            lib.borrow("B001");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("借书失败：" + e.getMessage());
        }

        // 测试3：借一本不存在的书（应该失败：查无此书）
        try
        {
            lib.borrow("B999");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("借书失败：" + e.getMessage());
        }

        System.out.println("===== 还书测试 =====");

        // 测试1：还一本已借出的书（B002 本来就是已借出状态，应该成功）
        try
        {
            lib.returnBook("B002");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("还书失败：" + e.getMessage());
        }

        // 测试2：再还一次刚归还的书（应该失败：未被借出）
        try
        {
            lib.returnBook("B002");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("还书失败：" + e.getMessage());
        }

        // 测试3：还一本不存在的书（应该失败：查无此书）
        try
        {
            lib.returnBook("B999");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("还书失败：" + e.getMessage());
        }

        System.out.println("===== 当前馆藏 =====");
        lib.showAll();

        System.out.println("===== 用户多态测试 =====");

        // 父类类型的变量，装子类的对象
        User u1 = new Reader("张三");
        User u2 = new Admin("李四");

        User[] users = {u1, u2};

        for (User u : users)
        {
            u.show();          // 同一行代码，输出不同角色 —— 多态
        }
    }
}

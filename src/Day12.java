import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Day12
{
    public static void main(String[] args)
    {
        // ===== 第一步：写入文件 =====
        try
        {
            FileWriter writer = new FileWriter("E:/projects/java-learning/note.txt");
            writer.write("你好，Java IO！\n");
            writer.write("第二行内容。\n");
            writer.close();   // 关掉，数据才真正落到磁盘
            System.out.println("写入成功！");
        }
        catch (IOException e)
        {
            System.out.println("写入失败：" + e.getMessage());
        }

        // ===== 第二步：读出文件 =====
        try
        {
            FileReader reader = new FileReader("E:/projects/java-learning/note.txt");
            int ch;
            while ((ch = reader.read()) != -1)   // -1 表示读到文件末尾
            {
                System.out.print((char) ch);
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("读取失败：" + e.getMessage());
        }
    }
}

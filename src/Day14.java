import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Day14
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        // ===== 启动时：从文件读取已有学生 =====
        try
        {
            FileReader reader = new FileReader("E:/projects/java-learning/students.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");

                String id = parts[0];
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                double score = Double.parseDouble(parts[3]);

                students.add(new Student(id, name, age, score));
            }

            br.close();
            System.out.println("读取完成，共 " + students.size() + " 个学生");
        }
        catch (IOException e)
        {
            System.out.println("没有找到数据文件，从零开始");
        }

        // ===== 添加学生（如果文件里有数据，先注释掉这三行测试） =====
        students.add(new Student("001", "张三", 20, 85.5));
        students.add(new Student("002", "李四", 23, 88));
        students.add(new Student("003", "王五", 25, 95.5));

        // ===== 显示所有学生 =====
        for (Student s : students)
        {
            s.show();
        }

        // ===== 保存到文件 =====
        try
        {
            FileWriter writer = new FileWriter("E:/projects/java-learning/students.txt");

            for (Student s : students)
            {
                writer.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getScore() + "\n");
            }

            writer.close();
            System.out.println("保存成功！");
        }
        catch (IOException e)
        {
            System.out.println("保存失败：" + e.getMessage());
        }
    }
}

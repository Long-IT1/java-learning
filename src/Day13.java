import java.util.ArrayList;

public class Day13
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("001", "张三", 20, 85.5));
        students.add(new Student("002", "李四", 23, 88));
        students.add(new Student("003", "王五", 25, 95.5));

        for (Student s : students)
        {
            s.show();
        }
    }
}

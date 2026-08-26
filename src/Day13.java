import java.util.ArrayList;

public class Day13
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("001", "张三", 20, 85.5));
        students.add(new Student("002", "李四", 23, 88));
        students.add(new Student("003", "王五", 25, 95.5));

        // 修改：张三成绩改90（你写对的部分）
        for (Student s : students)
        {
            if (s.getId().equals("001"))
            {
                s.setScore(90);
                System.out.println("已修改张三成绩");
            }
        }

        // 删除：学号002（放到这里，还在 main 里）
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getId().equals("002"))
            {
                students.remove(i);
                System.out.println("已删除学号002的学生");
                break;
            }
        }

        for (int i = 0; i < students.size(); i++)
        {
            for (int j = 0; j < students.size() - 1; j++)
            {
                if (students.get(j).getScore() < students.get(j + 1).getScore())
                {
                    // 交换 j 和 j+1 位置的学生
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("按成绩从高到低排序：");
        for (Student s : students)
        {
            s.show();
        }
    }
}
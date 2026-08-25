class Student
{
    private String id;
    private String name;
    private int age;
    private double score;

    Student(String id, String name, int age, double score)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getId()
    {
        return id;
    }

    public double getScore()
    {
        return score;
    }

    public void setScore(double s)
    {
        score = s;
    }

    void show()
    {
        System.out.println("学号：" + id + "，姓名：" + name + "，年龄：" + age + "，成绩：" + score);
    }
}

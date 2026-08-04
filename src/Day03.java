public class Day03
{
    public static void main(String[] args)
    {
        Person p1 = new Person("张三", 20);
        Person p2 = new Person("李四", 22);

        p1.introduce();
        p2.introduce();

        p1.grow();
        p1.introduce();
    }
}

class Person
{
    String name;
    int age;

    Person(String n,int a)
    {
     name = n;
     age = a;
    }
    void introduce()
    {
        System.out.println("我叫" + name + "，今年" + age + "岁");
    }
    void grow()
    {
        age = age + 1;
        System.out.println(name + "长大了一岁，现在" + age + "岁");
    }
}




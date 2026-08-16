public class Day05
{
    public static void main(String[] args)
    {
        Dog d = new Dog("旺财");
        Cat c = new Cat("咪咪");

        d.eat();          // eat 是父类的方法，Dog 继承了直接用
        d.bark();         // Dog 自己的方法

        c.eat();
        c.catchMouse();
    }
}

class Animal
{
    protected String name;

    Animal(String n)
    {
        name = n;
    }

    void eat()
    {
        System.out.println(name + "在吃东西");
    }

}

class Dog extends Animal
{
    Dog(String n)
    {
        super(n);
    }

    void bark()
    {
        System.out.println(name + "汪汪叫");
    }

}

class Cat extends Animal
{
    Cat(String n)
    {
        super(n);
    }

    void catchMouse()
    {
        System.out.println(name + "抓老鼠");
    }
}





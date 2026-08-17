public class Day06
{
    public static void main(String[] args)
    {
        Animal2[] zoo = {new Dog2("旺财"), new Cat2("咪咪")};

        for (Animal2 a : zoo)
        {
            a.makeSound();
        }
    }

}

class Animal2
{
    protected String name;

    Animal2(String n)
    {
        name = n;
    }

    void eat()
    {
        System.out.println(name + "在吃东西");
    }

    void makeSound()
    {
        System.out.println(name + "在叫");
    }

}

class Dog2 extends Animal2
{
    Dog2(String n)
    {
        super(n);
    }

    void makeSound()
    {
        System.out.println(name + "汪汪叫");
    }
}

class Cat2 extends Animal2
{
    Cat2(String n)
    {
        super(n);
    }
    void makeSound()
    {
        System.out.println(name + "喵喵叫");
    }
}
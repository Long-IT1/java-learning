public class Day07
{
    public static void main(String[] args)
    {
        Animal3[] zoo = {new Dog3("旺财"), new Cat3("咪咪")};

        for (Animal3 a : zoo)
        {
            a.makeSound();
        }
    }
}

abstract class Animal3
{
    protected String name;

    Animal3(String n)
    {
        name = n;
    }

    void eat()
    {
        System.out.println(name + "在吃东西" );
    }

    abstract void makeSound();
}

class Dog3 extends Animal3
{
    Dog3(String n)
    {
        super(n);
    }

    void makeSound()
    {
        System.out.println(name + "汪汪叫");
    }
}

class Cat3 extends Animal3
{
    Cat3(String n)
    {
        super(n);
    }

    void makeSound()
    {
        System.out.println(name + "喵喵叫");
    }
}




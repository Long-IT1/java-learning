public class Day08
{
    public static void main(String[] args)
    {
        CanSound[] group = {new Dog4("旺财"), new Robot("R2D2")};

        for (CanSound s : group)
        {
            s.makeSound();
        }
    }
}

interface CanSound
{
    void makeSound();
}

class Dog4 implements CanSound
{
    String name;

    Dog4(String n)
    {
        name = n;
    }

    public void makeSound()
    {
        System.out.println(name + "汪汪叫");
    }
}

class Robot implements  CanSound
{
    String name;
    Robot(String n)
    {
        name = n;
    }

    public void makeSound()
    {
        System.out.println(name + "滴滴响");
    }
}
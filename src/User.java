abstract class User
{
    protected String name;

    User(String name)
    {
        this.name = name;
    }

    abstract String getRole();

    void show()
    {
        System.out.println("角色: " + getRole() + ",姓名: " + name);
    }

}





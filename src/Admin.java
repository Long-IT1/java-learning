class Admin extends User
{
    Admin(String name)
    {
        super(name);
    }

    String getRole()
    {
        return "管理员";
    }
}

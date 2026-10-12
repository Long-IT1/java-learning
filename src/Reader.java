class Reader extends User
{
    Reader(String name)
    {
        super(name);
    }

    String getRole()
    {
        return "读者";
    }
}

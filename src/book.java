class Book
{
    private String id;
    private String title;
    private String author;
    private boolean borrowed;

    Book(String i, String t, String a, boolean b)
    {
        this.id = i;
        this.title = t;
        this.author = a;
        this.borrowed = b;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean isBorrowed()
    {
        return borrowed;
    }

    public void setBorrowed(boolean b)
    {
        borrowed = b;
    }

    void show()
    {
        String status = borrowed ? "已借出" : "在馆";   // 三元运算符：borrowed为true显示"已借出"，否则"在馆"
        System.out.println("编号：" + id + "，书名：" + title + "，作者：" + author + "，状态：" + status);
    }
}

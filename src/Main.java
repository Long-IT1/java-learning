public class Main
{
    public static void main(String[] args)
    {
        Library lib = new Library();

        lib.addBook(new Book("B001", "Java编程思想", "Bruce", false));
        lib.addBook(new Book("B002", "三体", "刘慈欣", true));

        lib.showAll();
    }
}

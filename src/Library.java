import java.util.ArrayList;

class Library
{
    private ArrayList<Book> books;

    Library()
    {
        books = new ArrayList<>();
    }

    void addBook(Book b)
    {
        books.add(b);
    }

    void showAll()
    {
        for (Book b : books)
        {
            b.show();
        }
    }
}

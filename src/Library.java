import java.util.HashMap;

class Library
{
    private HashMap <String,Book> books;

    Library()
    {
        books = new HashMap<>();
    }

    void addBook(Book b)
    {
        books.put(b.getId(),b);

    }

    void showAll()
    {
        for (Book b : books.values())
        {
            b.show();
        }
    }
    Book findById(String id)
    {
        return books.get(id);      // 报编号，直接拿书；没有就返回 null
    }
}

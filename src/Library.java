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
    void borrow(String id)
    {
        Book book = findById(id);

        if (book == null)
        {
            throw new IllegalArgumentException("查无此书：" + id);
        }

        if (book.isBorrowed())
        {
            throw new IllegalArgumentException("此书已被借出：" + id);
        }
        book.setBorrowed(true);     // ③ 通过检查，标记为已借出
        System.out.println("借阅成功：" + book.getTitle());
    }
    void returnBook(String id)
    {
        Book book = findById(id);

        if (book == null)
        {
            throw new IllegalArgumentException("查无此书：" + id);
        }

        if (!book.isBorrowed())          // 在馆的书不用归还
        {
            throw new IllegalArgumentException("该书未被借出，无需归还：" + id);
        }

        book.setBorrowed(false);         // 标记为归还
        System.out.println("归还成功：" + book.getTitle());
    }
}


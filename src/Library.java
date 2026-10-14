import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
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
    void saveToFile()
    {
        try
        {
            FileWriter writer = new FileWriter("E:/projects/java-learning/books.txt");

            for (Book b : books.values())
            {
                writer.write(b.getId() + "," + b.getTitle() + "," + b.getAuthor() + "," + b.isBorrowed() + "\n");
            }

            writer.close();
            System.out.println("保存成功，共 " + books.size() + " 本书");
        }
        catch (IOException e)
        {
            System.out.println("保存失败：" + e.getMessage());
        }
    }
    void loadFromFile()
    {
        try
        {
            FileReader reader = new FileReader("E:/projects/java-learning/books.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");

                String id = parts[0];
                String title = parts[1];
                String author = parts[2];
                boolean borrowed = Boolean.parseBoolean(parts[3]);

                books.put(id, new Book(id, title, author, borrowed));
            }

            br.close();
            System.out.println("读取成功，共 " + books.size() + " 本书");
        }
        catch (IOException e)
        {
            System.out.println("没有找到数据文件，从零开始");
        }
    }
}

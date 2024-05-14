import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        BookRepo bookRepo = new BookRepository();
        AuthorRepo authorRepo = new AuthorRepository();
        AuthorService authorService = new AuthorService(authorRepo);
        BookService bookService = new BookService(bookRepo, authorService);

        try {
            bookService.saveBook(1, "Aku", "Chairil Anwar");
            bookService.saveBook(2, "Laskar Pelangi", "Andrea Hirata");
            bookService.saveBook(3, "Saman", "Ayu Utami");
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Integer> bookIds = List.of(1, 2, 3);
        Map<Integer, List<Book>> booksByAuthor = bookService.rilisBukuBerdasarkanPenulis(bookIds);

        for (Map.Entry<Integer, List<Book>> entry : booksByAuthor.entrySet()) {
            int authorId = entry.getKey();
            List<Book> books = entry.getValue();
            System.out.println("Penulis ID: " + authorId);
            for (Book book : books) {
                System.out.println("\t" + book);
            }
        }
    }
}
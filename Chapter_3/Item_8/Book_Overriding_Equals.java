import java.util.Objects;

/**
 * Created by Trevor Jackson on 20-Jan-2017.
 */
public class Book_Overriding_Equals {

    private final int length;
    private final String title;
    private final String author;

    public Book_Overriding_Equals(int length, String title, String author) {
        this.length = length;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book_Overriding_Equals that = (Book_Overriding_Equals) o;
        return length == that.length &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author);
    }
}

import java.util.Objects;

/**
 * Created by Trevor Jackson on 2/15/2017.
 */
public class Book_Overriding_Equals_Subclass_Safe_Intellij {

    private final int length;
    private final String title;
    private final String author;

    public Book_Overriding_Equals_Subclass_Safe_Intellij(int length, String title, String author) {
        this.length = length;
        this.title = title;
        this.author = author;
    }

    // Generated By Default Settings in Intellij IDEA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book_Overriding_Equals_Subclass_Safe_Intellij)) return false;

        Book_Overriding_Equals_Subclass_Safe_Intellij that = (Book_Overriding_Equals_Subclass_Safe_Intellij) o;

        if (length != that.length) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }
}

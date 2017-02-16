import java.util.Objects;

/**
 * Created by Trevor Jackson on 20-Jan-2017.
 */
public class Book_Overriding_HashCode {

    public final int length;
    public final String title;
    public final String author;

    public Book_Overriding_HashCode(int length, String title, String author) {
        this.length = length;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (!(o instanceof Book_Overriding_Equals)){
            return false;
        }

        Book_Overriding_HashCode bOE = (Book_Overriding_HashCode) o;
        return bOE.length == length
            && bOE.title == title
            && bOE.author == author;
    }
}
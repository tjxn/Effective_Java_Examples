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
        if (this == o) {
            return true;
        }
        
        if (!(o instanceof Book_Overriding_Equals)){
            return false;
        }
        
        Book_Overriding_Equals bOE = (Book_Overriding_Equals) o;
        return bOE.length == length
            && bOE.title == title
            && bOE.author == author;
    }
}
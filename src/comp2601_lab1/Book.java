package comp2601_lab1;

/**
 * Represents a book with title, author, and year of publication
 * 
 * @author 	Samson James Ordonez
 * @version 1.0
 */
public class Book {
    private final String bookTitle;
    private final String bookAuthor;
    private final int yearPublished;

    public Book(final String bookTitle, 
    			final String bookAuthor,
    			final int yearPublished)
    {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    @Override
    public String toString()
    {   
        final StringBuilder sb;

        sb = new StringBuilder();
        
        sb.append("toString()=Book ");
        sb.append("[bookTitle=").append(bookTitle).append(", ");
        sb.append("bookAuthor=").append(bookAuthor).append(", ");
        sb.append("yearPublished=").append(yearPublished).append("]");
        
        return sb.toString();
    }
}
package comp2601_lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A driver class, BookTest, to test loading book data from a file.
 * 
 * @author Samson James Ordonez
 * @version 1.0	
 */
public class BookTest {
	
	private static final String TXT_FILE_LOCATION = "src//files/book_data.txt";
	private static final String TXT_FILE_DELIMETER = ",";
	private static final int TXT_FILE_LENGTH = 3;
	private static final int POSITION_BOOK_TITLE = 0;
	private static final int POSITION_BOOK_AUTHOR = 1;
	private static final int POSITION_BOOK_YEAR_PUBLISHED = 2;

    public static void main(String[] args) {
        loadBookData();
    }

    /**
     * Loads book data from a file and prints the information.
     */
    public static void loadBookData() {
        final List<Book> books;
        final File file;
        Scanner fileScanner;
        
        books = new ArrayList<>();
        file = new File(TXT_FILE_LOCATION);
        fileScanner = null;

        try {
            fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {

                String oneLine = fileScanner.nextLine();
                String[] bookData = oneLine.split(TXT_FILE_DELIMETER);

                if (bookData.length == TXT_FILE_LENGTH) {
                    String title = bookData[POSITION_BOOK_TITLE];
                    String author = bookData[POSITION_BOOK_AUTHOR];
                    int yearPublished = Integer.parseInt(bookData[POSITION_BOOK_YEAR_PUBLISHED]);
                    Book book = new Book(title, author, yearPublished);
                    books.add(book);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
        
        // Print the loaded books from the ArrayList
        for (final Book book : books) {
            System.out.println(book);
        }
    }
}

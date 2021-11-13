class Main {
    public static void main(String[] args) {
        TextBook textBook = new TextBook();
        System.out.println(textBook.getTitle());
    }
}

abstract class Book {
    protected static String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }
}

class TextBook extends Book {
    protected static String _title = title = "Textbook";
}

/*
 * Write an abstract class Book with a field for the title, an abstract method
 * to set the title and a method to get the title. Write a subclass TextBook
 * which implements the abstract method in the Book class. Write a main class
 * that instantiates TextBook, sets the title and prints the title of the
 * TextBook using the getter.
 */

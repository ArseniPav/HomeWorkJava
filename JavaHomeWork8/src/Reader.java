import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;
    private List<Book> takenBooks;

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.takenBooks = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printStatus() {
        System.out.print(fullName + " взял " + takenBooks.size() + " книги: ");
        for (int i = 0; i < takenBooks.size(); i++) {
            System.out.print(takenBooks.get(i).getName());
            if (i < takenBooks.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
        System.out.println(fullName + " взял книгу " + book.getName());
    }

    public void returnBook(String bookName) {
        for (Book book : takenBooks) {
            if (book.getName().equals(bookName)) {
                System.out.println(fullName + " вернул книгу " + bookName);
                takenBooks.remove(book);
                break;
            }
        }
        System.out.println(fullName + " не хранит книгу " + bookName);
    }
}
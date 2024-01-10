public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;
    private Book[] takenBooks;

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.takenBooks = new Book[10];
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
        System.out.print(fullName + " взял " + countTakenBooks() + " книги: ");
        for (int i = 0; i < takenBooks.length; i++) {
            if (takenBooks[i] != null) {
                System.out.print(takenBooks[i].getName());
                if (i < countTakenBooks() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public void takeBook(Book book) {
        for (int i = 0; i < takenBooks.length; i++) {
            if (takenBooks[i] == null) {
                takenBooks[i] = book;
                System.out.println(fullName + " взял книгу " + book.getName());
                break;
            }
        }
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < takenBooks.length; i++) {
            if (takenBooks[i] != null && takenBooks[i].getName().equals(bookName)) {
                System.out.println(fullName + " вернул книгу " + bookName);
                takenBooks[i] = null;
                break;
            }
        }
        System.out.println(fullName + " не хранит книгу " + bookName);
    }

    private int countTakenBooks() {
        int count = 0;
        for (Book book : takenBooks) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }
}
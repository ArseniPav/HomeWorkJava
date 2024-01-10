public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book2 = new Book("Война и Мир", "Лев Толстой");
        Book book3 = new Book("Игра Эндера", "Орсон Скотт Кард");

        Reader reader = new Reader("Петров В.В.", 12345, "Математика", "01.01.1990", "+375296574139");

        reader.takeBook(book1);
        reader.takeBook(book2);
        reader.takeBook(book3);

        reader.printStatus();

        reader.returnBook("Игра Эндера");

        reader.printStatus();
    }
}

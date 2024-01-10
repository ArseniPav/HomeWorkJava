
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375446585345", "Model1", 220);
        Phone phone2 = new Phone("+375447285695", "Model2", 170);
        Phone phone3 = new Phone("+375296878445", "Model3", 110);

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Виктор");
        phone2.receiveCall("Ольга", "+375447285695");
        phone3.getNumber();

        phone1.sendMessage("123456789", "987654321");
    }
}
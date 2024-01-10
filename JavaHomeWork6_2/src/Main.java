public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(6),
                new Drum(30.5),
                new Tuba(20.2)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
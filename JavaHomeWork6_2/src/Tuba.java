class Tuba implements Instrument {
    private double diameter;

    public Tuba(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет туба, диаметр: " + diameter);
    }
}
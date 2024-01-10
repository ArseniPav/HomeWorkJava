class Drum implements Instrument {
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, размер: " + size);
    }
}
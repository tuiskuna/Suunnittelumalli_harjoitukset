package src;

class Pizzapohja implements Pizza {

    private double price = 7.5;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String description() {
        return " pohja";
    }

}
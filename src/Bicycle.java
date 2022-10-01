public class Bicycle extends Light{
    private boolean hasCart;

    @Override
    public String toString() {
        return "Bicycle{" +
                "hasCart=" + hasCart +
                '}';
    }

    public boolean isHasCart() {
        return hasCart;
    }

    public void setHasCart(boolean hasCart) {
        this.hasCart = hasCart;
    }

    public Bicycle(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, boolean hasEngine, boolean hasCart) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, hasEngine);
        this.hasCart = hasCart;
    }
}

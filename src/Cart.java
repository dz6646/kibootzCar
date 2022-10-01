public class Cart extends Light{
    private int loadingTime;

    @Override
    public String toString() {
        return "Cart{" +
                "loadingTime=" + loadingTime +
                '}';
    }

    public int getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(int loadingTime) {
        this.loadingTime = loadingTime;
    }

    public Cart(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, boolean hasEngine, int loadingTime) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, hasEngine);
        this.loadingTime = loadingTime;
    }
}

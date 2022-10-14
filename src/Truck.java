public class Truck extends Heavy{
    private int maxWeight;

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public double exhaust()
    {
        return (super.exhaust() * 1.5);
    }
    public Truck(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int pullNum, int maxWeight) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, pullNum);
        this.maxWeight = maxWeight;
    }
}

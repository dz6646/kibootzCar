import java.util.Arrays;

public class Baggage extends Truck{
    private int numberOfItems;
    private String[] baggage;
    @Override
    public String toString() {
        return "Baggage{" +
                ", baggage=" + Arrays.toString(baggage) +
                '}';
    }


    public String[] getBaggage() {
        return baggage;
    }

    public void setBaggage(String[] baggage) {
        this.baggage = baggage;
    }

    public Baggage(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int pullNum, int maxWeight, String[] baggage) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, pullNum, maxWeight);
        this.baggage = baggage;
    }


}

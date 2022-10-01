public class Light extends Vehicles{
    @Override
    public String toString() {
        return "Light{" +
                "hasEngine=" + hasEngine +
                '}';
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public Light(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, boolean hasEngine) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin);
        this.hasEngine = hasEngine;
    }

    private boolean hasEngine;
}

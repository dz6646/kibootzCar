public class Heavy extends Vehicles{
    private int pullNum;

    public Heavy(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int pullNum) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin);
        this.pullNum = pullNum;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "pullNum=" + pullNum +
                '}';
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + 500 * this.pullNum;
    }
    public int getPullNum() {
        return pullNum;
    }

    public void setPullNum(int pullNum) {
        this.pullNum = pullNum;
    }
}

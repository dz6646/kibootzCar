public class Regular extends Vehicles{
    private int seatsNum;

    @Override
    public String toString() {
        return "Regular{" +
                "seatsNum=" + seatsNum +
                '}';
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public Regular(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int seatsNum) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin);
        this.seatsNum = seatsNum;
    }
}

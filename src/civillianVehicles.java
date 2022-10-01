public class civillianVehicles extends Regular{
    private int horsePower;
    private boolean isSports;

    @Override
    public String toString() {
        return "civillianVehicles{" +
                "horsePower=" + horsePower +
                ", isSports=" + isSports +
                '}';
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isSports() {
        return isSports;
    }

    public void setSports(boolean sports) {
        isSports = sports;
    }

    public civillianVehicles(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int seatsNum, int horsePower, boolean isSports) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, seatsNum);
        this.horsePower = horsePower;
        this.isSports = isSports;
    }
}

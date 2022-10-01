public class Tractor extends Heavy{
    private String pullType;

    @Override
    public String toString() {
        return "Tractor{" +
                "pullType='" + pullType + '\'' +
                '}';
    }

    public String getPullType() {
        return pullType;
    }

    public void setPullType(String pullType) {
        this.pullType = pullType;
    }

    public Tractor(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int pullNum, String pullType) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, pullNum);
        this.pullType = pullType;
    }
}

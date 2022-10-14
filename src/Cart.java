import java.util.Scanner;

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

    public double exhaust() // Pollution for a minute loading
    {
        return super.exhaust() / this.loadingTime;
    }
    public void setLoadingTime(int loadingTime) {
        this.loadingTime = loadingTime;
    }

    public void hitchhikers()
    {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("You have successfully hitchikered " + name);
    }
    public Cart(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, boolean hasEngine, int loadingTime) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin, hasEngine);
        this.loadingTime = loadingTime;
    }
}

import java.util.Scanner;
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

    public double exhaust()
    {
        return super.exhaust() * 7; // Weekly pollution
    }

    public void noise()
    {
        if(super.getVehicleAge() > 10)
        {
            System.out.println("vroom");
        }
        else if(super.getVehicleAge() > 5)
        {
            System.out.println("vrooooooom");
        }
        else
        {
            System.out.println("vrooooooooooooooooooooooooooooooooooom");
        }
    }
    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public void hitchhikers()
    {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("You have successfully hitchikered " + name);
    }
    public Regular(int vehicleNum, int vehicleAge, int wheelsNum, String controlType, int polutionPerMin, int seatsNum) {
        super(vehicleNum, vehicleAge, wheelsNum, controlType, polutionPerMin);
        this.seatsNum = seatsNum;
    }
}

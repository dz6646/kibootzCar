public class Main {
    public static void main(String[]args)
    {
        
    }

    public double allPolution(Vehicles[] input)
    {
        double sum = 0;
        int i = 0;
        for(i = 0; i < input.length; i++)
        {
            sum += input[i].exhaust();
        }
        return sum;
    }

    public void allnoise(Vehicles[] input)
    {
        int i = 0;
        for(i = 0; i < input.length; i++)
        {
            if(input[i] instanceof Regular)
            {
                ((Regular) input[i]).noise();
            }
        }

    }

    public int maxPassengers(Vehicles[] cars)
    {
        int sum = 0;
        int i;
        for (i = 0; i < cars.length; i++)
        {
            if(cars[i] instanceof Bicycle)
            {
                sum += 1;
            }
            else if(cars[i] instanceof Regular)
            {
                sum += 4;
            }
        }
        return sum;
    }
    public int maxLoading(Vehicles[] cars)
    {
        int max = 0;
        int maxIndex = 0;
        int i;
        for (i = 0; i < cars.length; i++)
        {
            if(cars[i] instanceof Cart)
            {
                if(((Cart) cars[i]).getLoadingTime() > max)
                {
                    max = ((Cart) cars[i]).getLoadingTime();
                    maxIndex = i;
                }
            }
        }
        return cars[maxIndex].getVehicleNum();
    }
}

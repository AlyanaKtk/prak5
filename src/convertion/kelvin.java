package convertion;

public class kelvin implements convertable
{
    @Override
    public double convert(int temp)
    {
        return (temp + 273.15);
    }


}

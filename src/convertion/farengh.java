package convertion;

public class farengh implements convertable
{
    @Override
    public double convert(int temp)
    {

        return ((temp * 1.8)+32);
    }
}
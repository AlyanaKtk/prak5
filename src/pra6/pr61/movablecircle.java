package pra6.pr61;

public class movablecircle extends movablepoint implements Movable
{
    int radius;
    movablecircle(int x, int y, int xspeed, int yspeed, int radius)
    {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package Computer;

public class Computer
{
    models model;
    double price;
    Computer(){};
    Computer(models model, double price)
    {
        this.model = model;
        this.price = price;
    }
    public void setModel(models model) {
        this.model = model;
    }

    public models getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
enum models
{
    HP,
    MSI,
    MAC

}
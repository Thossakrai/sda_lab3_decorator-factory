package xmastree;

public class DouglasFir extends Tree{
    public DouglasFir() { description = "Douglas fir tree decorated with "; }

    @Override
    public double cost() {
        return 15;
    }
}

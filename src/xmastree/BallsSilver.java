package xmastree;

public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree tree) { this.tree = tree; }
    public String getDescription() { return  tree.getDescription() + ", Balls silver "; }

    @Override
    public double cost() { return 3 + tree.cost(); }
}

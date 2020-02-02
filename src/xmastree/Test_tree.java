package xmastree;

public class Test_tree {
	
	public static void main(String[] args) {

		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ribbons(mytree);
		mytree = new Lights(mytree);
		mytree = new Star(mytree);
		mytree = new Ribbons(mytree);
		mytree = new Ruffles(mytree);

		System.out.print(mytree.getDescription() + " costs: " +mytree.cost());
	}
}

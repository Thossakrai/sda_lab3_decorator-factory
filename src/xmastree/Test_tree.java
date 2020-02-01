package xmastree;

public class Test_tree {
	
	public static void main(String[] args) {
//		Tree mytree = new BlueSpruce();
//		mytree = new Star(mytree);
//		mytree = new Ruffles(mytree);
//		mytree = new Ruffles(mytree);
//		mytree = new Ruffles(mytree);
		Tree mytree = new BlueSpruce();
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);
		mytree = new Star(mytree);
		mytree = new Ruffles(mytree);


		//mytree = new Star(mytree);
		System.out.print(mytree.getDescription() + " costs: " +mytree.cost());
	}
}

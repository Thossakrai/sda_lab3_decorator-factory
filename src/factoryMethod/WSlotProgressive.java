package factoryMethod;

public class WSlotProgressive extends Slot {
	public WSlotProgressive() {
		name="Progressive";
		os = "Android";
		components.add("Large");
		components.add("coins");
		components.add("reels");
		components.add("ARM");
	}
	
	void ship() {
		System.out.println("Having uncle vinnie drop it off");
	}
}

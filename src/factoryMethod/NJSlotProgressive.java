package factoryMethod;

public class NJSlotProgressive extends Slot {
	public NJSlotProgressive() {
		name="Progressive";
		os = "Windows XP";
		components.add("Small");
		components.add("bills");
		components.add("CRT");
		components.add("X86");
	}
	
	void ship() {
		System.out.println("Having uncle vinnie drop it off");
	}
}

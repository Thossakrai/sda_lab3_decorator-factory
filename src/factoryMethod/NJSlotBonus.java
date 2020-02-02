package factoryMethod;

public class NJSlotBonus extends Slot {
    public NJSlotBonus() {
        name = "Bonus";
        os = "Windows ME";
        components.add("Large");
        components.add("coins");
        components.add("reels");
        components.add("ARM");
    }
}

package factoryMethod;

public class NJSlotStraight extends Slot {
    public NJSlotStraight(){
        name = "Straight";
        os = "Linux";
        components.add("Small");
        components.add("coins");
        components.add("LCD");
        components.add("ARM");
    }
}

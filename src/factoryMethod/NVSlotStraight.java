package factoryMethod;

public class NVSlotStraight extends Slot {
    public NVSlotStraight(){
        name = "Straight";
        os = "Linux";
        components.add("Large");
        components.add("ticketInTicketOut");
        components.add("reels");
        components.add("ARM");
    }
}

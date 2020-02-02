package factoryMethod;

public class NVSlotBonus extends Slot {
    public NVSlotBonus(){
        name = "Bonus";
        os = "Linux";
        components.add("Small");
        components.add("ticketInTicketOut");
        components.add("CRT");
        components.add("X86");
    }
}

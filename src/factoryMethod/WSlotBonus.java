package factoryMethod;

public class WSlotBonus extends Slot {
    public WSlotBonus() {
        name = "Bonus";
        os = "Symbian";
        components.add("Medium");
        components.add("ticketInTicketOut");
        components.add("VGA");
        components.add("ARM");
    }
}

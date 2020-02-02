package factoryMethod;

public class TestSlots {
	public static void main(String[] args) {
		SlotStore NVStore = new NVSlotStore();
		SlotStore NJStore = new NJSlotStore();
		SlotStore WStore = new WSlotStore();

		Slot slot = NVStore.orderSlot(slottype.progressive);
		System.out.println("Taj Mahal ordered a "+ slot.getName());

		slot = NJStore.orderSlot(slottype.progressive);
		System.out.println("Borgata ordered a "+ slot.getName());

		slot = WStore.orderSlot(slottype.bonus);
		System.out.println("Thossakie ordered a " + slot.getName());

		slot = NJStore.orderSlot(slottype.straight);
		System.out.println("Beam Zug ordered a " + slot.getName());
	}

}

package factoryMethod;

public class WSlotStore extends SlotStore {

	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.progressive)) { 
			tmp = new WSlotProgressive();
			tmp.cost=(float) (tmp.cost*1.1);
		}
		return tmp;
	}
}

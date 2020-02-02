package factoryMethod;

public class NJSlotStore extends SlotStore {

	protected Slot makeSlot(slottype type) {
		Slot tmp = null;
		if (type.equals(slottype.progressive)) { 
			tmp = new NJSlotProgressive();
//			tmp.cost=(float) (tmp.cost*1.1);
		} else if (type.equals(slottype.bonus)) {
			tmp = new NJSlotBonus();
		} else if (type.equals(slottype.straight)) {
			tmp = new NJSlotStraight();
		} else return null;
		return tmp;
	}
}

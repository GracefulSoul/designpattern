package gracefulsoul.creational.builder.item.drink;

import gracefulsoul.creational.builder.item.Item;
import gracefulsoul.creational.builder.packing.Bottle;
import gracefulsoul.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
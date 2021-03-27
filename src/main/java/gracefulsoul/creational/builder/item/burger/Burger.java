package gracefulsoul.creational.builder.item.burger;

import gracefulsoul.creational.builder.item.Item;
import gracefulsoul.creational.builder.packing.Packing;
import gracefulsoul.creational.builder.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
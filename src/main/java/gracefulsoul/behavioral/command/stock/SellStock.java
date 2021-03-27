package gracefulsoul.behavioral.command.stock;

import gracefulsoul.behavioral.command.order.Order;

public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}

}
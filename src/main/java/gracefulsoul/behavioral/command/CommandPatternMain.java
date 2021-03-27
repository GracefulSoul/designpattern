package gracefulsoul.behavioral.command;

import gracefulsoul.behavioral.command.broker.Broker;
import gracefulsoul.behavioral.command.stock.BuyStock;
import gracefulsoul.behavioral.command.stock.SellStock;
import gracefulsoul.behavioral.command.stock.Stock;

public class CommandPatternMain {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}

}

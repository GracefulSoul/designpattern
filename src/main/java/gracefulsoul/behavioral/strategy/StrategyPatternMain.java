package gracefulsoul.behavioral.strategy;

import gracefulsoul.behavioral.strategy.operation.AddOperation;
import gracefulsoul.behavioral.strategy.operation.MultiplyOperation;
import gracefulsoul.behavioral.strategy.operation.SubstractOperation;

public class StrategyPatternMain {

	public static void main(String[] args) {
		Context context = new Context(new AddOperation());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new SubstractOperation());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new MultiplyOperation());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}

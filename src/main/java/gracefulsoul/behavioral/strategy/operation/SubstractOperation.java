package gracefulsoul.behavioral.strategy.operation;

public class SubstractOperation implements Operation {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}

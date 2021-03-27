package gracefulsoul.behavioral.state.state;

import gracefulsoul.behavioral.state.context.Context;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "Start State";
	}

}

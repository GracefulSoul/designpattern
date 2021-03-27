package gracefulsoul.behavioral.state;

import gracefulsoul.behavioral.state.context.Context;
import gracefulsoul.behavioral.state.state.StartState;
import gracefulsoul.behavioral.state.state.StopState;

public class StatePatternMain {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
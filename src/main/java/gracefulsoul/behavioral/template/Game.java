package gracefulsoul.behavioral.template;

public abstract class Game {

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// Template method
	public final void play() {
		// Initialze the game
		initialize();
		// Start game
		startPlay();
		// End game
		endPlay();
	}

}

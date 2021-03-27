package gracefulsoul.behavioral.observer;

import gracefulsoul.behavioral.observer.observer.BinaryObserver;
import gracefulsoul.behavioral.observer.observer.HexaObserver;
import gracefulsoul.behavioral.observer.observer.OctalObserver;
import gracefulsoul.behavioral.observer.subject.Subject;

public class ObserverPatternMain {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
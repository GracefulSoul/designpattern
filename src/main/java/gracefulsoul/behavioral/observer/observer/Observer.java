package gracefulsoul.behavioral.observer.observer;

import gracefulsoul.behavioral.observer.subject.Subject;

public abstract class Observer {

	protected Subject subject;

	public abstract void update();

}
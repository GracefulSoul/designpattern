package gracefulsoul.behavioral.visitor.visitor;

import gracefulsoul.behavioral.visitor.part.Computer;
import gracefulsoul.behavioral.visitor.part.Keyboard;
import gracefulsoul.behavioral.visitor.part.Monitor;
import gracefulsoul.behavioral.visitor.part.Mouse;

public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);

}

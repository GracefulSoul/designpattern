package gracefulsoul.behavioral.visitor.visitor;

import gracefulsoul.behavioral.visitor.part.Computer;
import gracefulsoul.behavioral.visitor.part.Keyboard;
import gracefulsoul.behavioral.visitor.part.Monitor;
import gracefulsoul.behavioral.visitor.part.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}

}
package gracefulsoul.behavioral.visitor;

import gracefulsoul.behavioral.visitor.part.Computer;
import gracefulsoul.behavioral.visitor.part.ComputerPart;
import gracefulsoul.behavioral.visitor.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternMain {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}

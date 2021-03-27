package gracefulsoul.behavioral.visitor.part;

import gracefulsoul.behavioral.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);

}

package gracefulsoul.behavioral.visitor.part;

import gracefulsoul.behavioral.visitor.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}

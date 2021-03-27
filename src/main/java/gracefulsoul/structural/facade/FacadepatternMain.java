package gracefulsoul.structural.facade;

import gracefulsoul.structural.facade.shape.ShapeMaker;

public class FacadepatternMain {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}

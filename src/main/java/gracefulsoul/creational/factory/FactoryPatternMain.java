package gracefulsoul.creational.factory;

import gracefulsoul.creational.factory.shape.Shape;
import gracefulsoul.creational.factory.shape.ShapeFactory;
import gracefulsoul.creational.factory.shape.ShapeType;

public class FactoryPatternMain {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// Get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);

		// Call draw method of Circle
		shape1.draw();

		// Get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);

		// Call draw method of Rectangle
		shape2.draw();

		// Get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);

		// Call draw method of circle
		shape3.draw();
	}

}

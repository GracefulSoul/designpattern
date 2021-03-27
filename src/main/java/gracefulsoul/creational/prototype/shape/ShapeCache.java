package gracefulsoul.creational.prototype.shape;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeCache {

	private static Map<Integer, Shape> shapeMap = new ConcurrentHashMap<Integer, Shape>();

	public static Shape getShape(int shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// For each shape run database query and create shape shapeMap.put(shapeKey, shape);
	// For example, we are adding three shapes
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(1);
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId(2);
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId(3);
		shapeMap.put(rectangle.getId(), rectangle);
	}

}

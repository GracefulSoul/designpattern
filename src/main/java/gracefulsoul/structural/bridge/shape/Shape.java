package gracefulsoul.structural.bridge.shape;

import gracefulsoul.structural.bridge.draw.DrawAPI;

public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}

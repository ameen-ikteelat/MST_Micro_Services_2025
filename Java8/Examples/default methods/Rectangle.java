package com.mst.java8;

public class Rectangle implements Dimensional, AbstractDimentional {
	// TODO: What happens if we remove this
	@Override
	public int getArea(int w, int h) {
		return w*h;
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}

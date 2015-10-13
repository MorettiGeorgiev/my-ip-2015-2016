package org.elsysbg.ip.java;

public class Room {
	

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea() {

		return height * width;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Room) {
			final Room room2 = (Room) obj;
			return room2.height == height && room2.width == width; 
		}
		return false;
	}

}

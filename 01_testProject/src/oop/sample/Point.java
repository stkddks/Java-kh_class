package oop.sample;

public class Point {

	private int posX;
	private int posY;
	
	public void out() {
		System.out.println("[" +posX+ "," +posY+ "]");
	}
	public int getPosX() { return posX;}
	public void setPosX(int posX) {this.posX = posX;}
	public int getPosY() { return posY;}
	public void setPosY(int posY) {this.posY=posY;}
	
	public Point() {
		this(10, 20);
	}
	public Point(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
	}
	}

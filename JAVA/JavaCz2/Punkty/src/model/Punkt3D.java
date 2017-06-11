package model;

public class Punkt3D extends Punkt{
	
	private int z;
	
	public Punkt3D(){
		z = 0;
		setX(0);
		setY(0);
	}
	
	public Punkt3D(int x, int y, int z){
		setX(x);
		setY(y);
		this.z = 0;	
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}

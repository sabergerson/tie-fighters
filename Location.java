package bergerson.TIESPT;

//Location class
public class Location {
	
	//Data fields
	private int x;
	private int y;
	private int z;
	
	//Constructor
	public Location(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Behaviors: instance methods
	
	//name: toString
	//method: formats location informations
	public String toString() {
		String location = "Location [X:"+String.valueOf(this.x)+", Y:"+this.y+", Z:"+this.z+"]";
		return location;
	}

	//Accessors and mutators 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
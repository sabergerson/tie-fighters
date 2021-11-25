package bergerson.TIEFIGHTER;

//Import necessary interfaces
import bergerson.TIEOPS.Maneuvering;
import bergerson.TIEOPS.Scanning;
import bergerson.TIESPT.Location;
import bergerson.TIESPT.TiePilot;
import bergerson.TIEWPNS.TieWeapon;

//Tie Fighter Abstract Class (implements Maneuvering, Scanning interfaces)
public abstract class TieFighter implements Maneuvering, Scanning {
	
	//Data Fields
	private String manufacturer;
	private String iDNumber;
	private String model;
	private TieWeapon[] wpns;
	private TiePilot pilot;
	private String fighterClass;
	private double length;
	private double width;
	private double height;
	private int fuelCapacity;
	private int maxSpeed;
	private boolean isLanded;
	private boolean isSpaceborne;
	private Location currentLocation;
	
	//Constructor
	public TieFighter(String iDNumber, TiePilot pilot) {
		this.iDNumber = iDNumber;
		this.pilot = pilot;
	}
	
	//Behaviors: Instance methods
	
	//name: displayFighterData
	//method: displays information about the fighter to console
	public void displayFighterData() {
		System.out.println("MODEL: "+this.model);
		System.out.println("ID Number: "+this.iDNumber);
		System.out.println("PILOT ID Number: "+this.pilot.getiDNumber());
		System.out.println("PILOT Rank: "+this.pilot.getRank());		
	}
	
	//Behaviors: Abstract methods
	
	//name: FiresCannon
	//method: (implemented in subclasses)
	public abstract void FiresCannon();

	//Implemented Methods (Scanning)
	
	//name: scanTarget
	//method: notifies user fighter is scanning for target
	@Override
	public void scanTarget() {
		System.out.print(this.iDNumber+" is scanning for targets");
	}

	//Implemented Methods (Maneuvering)
	
	//name: MoveLeft
	//method: moves fighter location one unit to left
	@Override
	public void MoveLeft() {
		int x = this.currentLocation.getX();
		this.currentLocation.setX(x-1);	
	}

	//name: MoveRight
	//method: moves fighter location one unit to right
	@Override
	public void MoveRight() {
		int x = this.currentLocation.getX();
		this.currentLocation.setX(x+1);
	}

	//name: MoveForward
	//method: moves fighter location one unit forward
	@Override
	public void MoveForward() {
		int x = this.currentLocation.getY();
		this.currentLocation.setY(x+1);	
	}

	//name: MoveBackward
	//method: moves fighter location one unit backwards
	@Override
	public void MoveBackward() {
		int x = this.currentLocation.getY();
		this.currentLocation.setY(x-1);	
	}

	//name: Ascend
	//method: moves fighter location one unit up
	@Override
	public void Ascend() {
		int x = this.currentLocation.getZ();
		this.currentLocation.setZ(x+1);	
	}

	//name: Descend
	//method: moves fighter location one unit down
	@Override
	public void Descend() {
		int x = this.currentLocation.getZ();
		this.currentLocation.setZ(x-1);	
	}

	//name: Land
	//method: moves fighter to minimum height
	@Override
	public void Land() {
		this.currentLocation.setZ(0);
		this.isLanded = true;
		this.isSpaceborne = false;
	}

	//name: Takeoff
	//method: moves fighter to maximum height
	@Override
	public void Takeoff() {
		this.currentLocation.setZ(10);
		this.isLanded = false;
		this.isSpaceborne = true;
	}

	//Accessors and Mutators
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public TieWeapon[] getWpns() {
		return wpns;
	}

	public void setWpns(TieWeapon[] wpns) {
		this.wpns = wpns;
	}

	public String getFighterClass() {
		return fighterClass;
	}

	public void setFighterClass(String fighterClass) {
		this.fighterClass = fighterClass;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isLanded() {
		return isLanded;
	}

	public void setLanded(boolean isLanded) {
		this.isLanded = isLanded;
	}

	public boolean isSpaceborne() {
		return isSpaceborne;
	}

	public void setSpaceborne(boolean isSpaceborne) {
		this.isSpaceborne = isSpaceborne;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public TiePilot getPilot() {
		return pilot;
	}

	public void setPilot(TiePilot pilot) {
		this.pilot = pilot;
	}	
}
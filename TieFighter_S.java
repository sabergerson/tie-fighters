package bergerson.TIEFIGHTER;

//Import necessary classes
import bergerson.TIESPT.Location;
import bergerson.TIESPT.TiePilot;
import bergerson.TIEWPNS.LaserCannon;

//Tie Fighter Standard Class (extends TieFighter)
public class TieFighter_S extends TieFighter {
	
	//Give fighter laser cannons
	LaserCannon laser1 = new LaserCannon("L1");
	LaserCannon laser2 = new LaserCannon("L1");

	//Constructor
	public TieFighter_S(String iDNumber, TiePilot pilot) {
		//inheritance 
		super(iDNumber, pilot);
		//set remaining fields
		setManufacturer("Sienar Fleet Systems");
		setModel("Tie Standard");
		setFighterClass("Superiority");
		setLength(6.3);
		setWidth(6.4);
		setHeight(7.5);
		setFuelCapacity(200);
		setMaxSpeed(1200);
		setLanded(true);
		setSpaceborne(false);
		Location location = new Location(10, 12, 0);
		setCurrentLocation(location);
	}
	
	//Implement methods from TieFighter (abstract class)
	
	//name: FiresCannon
	//method: fires both laser cannons
	@Override
	public void FiresCannon() {
		laser1.Fire();
		laser2.Fire();	
	}
}
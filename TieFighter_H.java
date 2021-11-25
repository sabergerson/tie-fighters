package bergerson.TIEFIGHTER;

//Import Bombing interface
import bergerson.TIEOPS.Bombing;

import bergerson.TIESPT.Location;
import bergerson.TIESPT.TiePilot;
import bergerson.TIEWPNS.LaserCannon;
import bergerson.TIEWPNS.ProtonBomb;

//Tie Fighter Heavy Fighter Class (extends TieFighter, implements Bombing)
public class TieFighter_H extends TieFighter implements Bombing {
	
	//Give fighter laser cannons
	LaserCannon laser1 = new LaserCannon("L2");
	LaserCannon laser2 = new LaserCannon("L2");
	
	//Give fighter proton bombs
	ProtonBomb[] bombs = new ProtonBomb[8]; {
		bombs[0] = new ProtonBomb("P1");
		bombs[1] = new ProtonBomb("P1");
		bombs[2] = new ProtonBomb("P1");
		bombs[3] = new ProtonBomb("P1");
		bombs[4] = new ProtonBomb("P1");
		bombs[5] = new ProtonBomb("P1");
		bombs[6] = new ProtonBomb("P1");
		bombs[7] = new ProtonBomb("P1");	
	}

	//Constructor
	public TieFighter_H(String iDNumber, TiePilot pilot) {
		//inheritance
		super(iDNumber, pilot);
		//set remaining fields
		setManufacturer("Sienar Fleet Systems");
		setModel("Tie Heavy Fighter");
		setFighterClass("Close Support");
		setLength(7.8);
		setWidth(8.6);
		setHeight(5.0);
		setFuelCapacity(375);
		setMaxSpeed(850);
		setLanded(true);
		setSpaceborne(false);
		Location location = new Location(10, 12, 0);
		setCurrentLocation(location);
	}
	
	//Implement methods from TieFighter (abstract class)
	
	//name: FiresCannon
	//method: fires laser cannons
	@Override
	public void FiresCannon() {
		laser1.Fire();
		laser2.Fire();	
	}
	
	//Implement methods from Bombing (interface)
	
	//name: bombTarget
	//method: drop proton bomb if available
	@Override
	public boolean bombTarget() {
		boolean bombed = false;
		//check for undropped bomb from supply
		for(ProtonBomb b: this.bombs) {
			if(b.isDropped() == false) {
				//drop bomb if found
				b.Fire();
				System.out.println("Bombs Away");
				bombed = true;
				break;
			}
			else {
				//continue checking 
				continue;
			}
		}
		//return whether bomb was dropped
		return bombed;
	}
}
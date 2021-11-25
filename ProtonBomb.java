package bergerson.TIEWPNS;

//Proton Bomb class
public class ProtonBomb extends TieWeapon {
	
	//Data fields
	private int yield;
	private boolean dropped;

	//Constructor
	public ProtonBomb(String model) {
		//inheritance
		super(model);
		//remaining fields
		this.yield = 7;
		this.dropped = false;
	}

	//Implement TieWeapon methods
	
	//name: Fire
	//method: resets bomb dropped status to true
	@Override
	public void Fire() {
		this.dropped = true;
	}

	//Accessors and mutators
	public int getYield() {
		return yield;
	}

	public void setYield(int yield) {
		this.yield = yield;
	}

	public boolean isDropped() {
		return dropped;
	}

	public void setDropped(boolean dropped) {
		this.dropped = dropped;
	}
}
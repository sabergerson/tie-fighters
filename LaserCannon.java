package bergerson.TIEWPNS;

//Laser Cannon Class (extends TieWeapon)
public class LaserCannon extends TieWeapon {

	//Data fields
	private int maxRange;
	private int ammoCapacity;
	private int currentAmmoCount;
	
	//Constructor
	public LaserCannon(String model) {
		//inheritance
		super(model);
		//remaining fields
		this.setMaxRange(1000);
		this.ammoCapacity = 500;
		this.setCurrentAmmoCount(500);
	}
	
	//Implement TieWeapon methods
	
	//name: Fire
	//method: fires laser cannons
	@Override
	public void Fire() {
		//checks for remaining ammo
		if(this.ammoCapacity > 0) {
			//fires cannon
			this.setCurrentAmmoCount(this.getCurrentAmmoCount() - 1);
			System.out.println("Firing Cannon");
		}
		//if no ammo found, notifies user
		else {
			System.out.println("Ammunition Expended");
		}
	}

	//Accessors and mutators 
	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getCurrentAmmoCount() {
		return currentAmmoCount;
	}

	public void setCurrentAmmoCount(int currentAmmoCount) {
		this.currentAmmoCount = currentAmmoCount;
	}
}
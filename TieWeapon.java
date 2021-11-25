package bergerson.TIEWPNS;

public abstract class TieWeapon {
	
	private String model;

	public TieWeapon(String model) {
		super();
		this.model = model;
	}
	
	public abstract void Fire();

	//Accessors and mutators
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
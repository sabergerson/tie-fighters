package bergerson.TIEOPS;

//Maneuvering interface
public interface Maneuvering {
	
	//Abstract methods
	
	//name: MoveLeft
	//method: (implemented in classes)
	public abstract void MoveLeft();
	
	//name: MoveRight
	//method: (implemented in classes)
	public abstract void MoveRight();
	
	//name: MoveForward
	//method: (implemented in classes)
	public abstract void MoveForward();
	
	//name: MoveBackward
	//method: (implemented in classes)
	public abstract void MoveBackward();
	
	//name: Ascend
	//method: (implemented in classes)
	public abstract void Ascend();
	
	//name: Descend
	//method: (implemented in classes)
	public abstract void Descend();
	
	//name: Land
	//method: (implemented in classes)
	public abstract void Land();
	
	//name: Takeoff
	//method: (implemented in classes)
	public abstract void Takeoff();
}
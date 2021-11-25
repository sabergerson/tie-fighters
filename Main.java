package bergerson.MAIN;

//Import necessary classes
import bergerson.TIEFIGHTER.TieFighter_H;
import bergerson.TIEFIGHTER.TieFighter_S;
import bergerson.TIESPT.TiePilot;

//Main method
public class BergersonHW5 {

	public static void main(String[] args) {
		TiePilot SP1 = new TiePilot("SP-001", "LT", "Veteran");
		TiePilot HP1 = new TiePilot("SP-002", "CAPT", "Elite");
		TieFighter_S ts = new TieFighter_S("ITS-001", SP1);
		TieFighter_H th = new TieFighter_H("ITH-001", HP1);
	
		ts.displayFighterData();
		System.out.println();
		th.displayFighterData();
		System.out.println();
		ts.FiresCannon();
		System.out.println();
		th.bombTarget();
		System.out.println();
		ts.getPilot().displaysInfo();
		System.out.println();
		th.getPilot().displaysInfo();
		
		System.out.println();
		System.out.println(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.println(th.getCurrentLocation().toString());
		
		th.Takeoff();
		ts.Takeoff();
		System.out.println();
		System.out.println(ts.getCurrentLocation().toString());
		System.out.println();
		System.out.println(th.getCurrentLocation().toString());
	
	}
}
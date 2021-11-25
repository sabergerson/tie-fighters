package bergerson.TIESPT;

//Tie Pilot Class
public class TiePilot {
	
	//Data fields
	private String iDNumber;
	private String rank;
	private String pilotRanking;
	
	//Constructor
	public TiePilot(String iDNumber, String rank, String pilotRanking) {
		this.iDNumber = iDNumber;
		this.rank = rank;
		this.pilotRanking = pilotRanking;
	}
	
	//Behaviors: instance methods
	
	//name: displaysInfo
	//method: displays pilot information to console
	public void displaysInfo() {
		System.out.println("Imperial Pilot**********");
		System.out.println("ID: "+this.iDNumber);
		System.out.println("RANK: "+this.rank);
		System.out.println("RATING: "+this.pilotRanking);	
	}

	//Accessors and mutators
	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPilotRanking() {
		return pilotRanking;
	}

	public void setPilotRanking(String pilotRanking) {
		this.pilotRanking = pilotRanking;
	}
}

//Create an abstract class, called Instrument which will 
//contains a field name and a method called play, that must be 
//implemented by a sub-class 




abstract class Instrument{
	
	protected String name;
	abstract public void play();
	
	
}

abstract class Music extends Instrument{
	
protected int noOfPlayers;
}


public class Abstract extends Music{
	
	public Abstract(){
		super();
		this.name="rocky";
		this.noOfPlayers =2;
		
	}
	public Abstract(int noOfPlayers){
		super();
		this.name="chanel";
		this.noOfPlayers=noOfPlayers;
		
	}
	
	@Override
	public void play(){
		System.out.println("An Electric guitar is been played by  "+ noOfPlayers);
		
		
	}
	
	
}



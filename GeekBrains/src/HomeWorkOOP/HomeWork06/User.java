package HomeWorkOOP.HomeWork06;

public class User{
	private final String name;
	private final IReport reporter;
	private final ISave saver;
	
	public User(String name){
		this.name = name;
		reporter = new EmailReporter(this);
		saver = new Persister(this);
	}
	
	public String getName(){
		return name;
	}
	
	public void sendReport(){
		reporter.report();
	}
	
	public void save(){
		
		saver.save();
	}
}
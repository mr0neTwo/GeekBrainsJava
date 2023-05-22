package HomeWorkOOP.HomeWork06;

public class User{
	private String name;
	private IReport reporter;
	private ISave saver;
	
	public User(String name){
		this.name = name;
		reporter = new EmailReporter(this);
	}
	
	public String getName(){
		return name;
	}
	
	public void sendReport(){
		reporter.report();
	}
	
	public void save(){
		Persister saver = new Persister(this);
		saver.save();
	}
}
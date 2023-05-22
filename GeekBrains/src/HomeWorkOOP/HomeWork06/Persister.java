package HomeWorkOOP.HomeWork06;

public class Persister implements ISave{
	private final User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}
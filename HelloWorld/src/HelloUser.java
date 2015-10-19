
public class HelloUser {
	private String name;
	
	public HelloUser(String name)
	{
		this.name = name;
	}
	
	public void greetUser()
	{
		System.out.println("Why hello there " + name + "!!");
	}
}

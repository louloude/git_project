package xxy;

public class User {
	private String name;
	private String phone;
	
	
	public static void hello()
	{
	    
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + "]";
	}	
}

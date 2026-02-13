package FactoryMethod;

public class FactoryClass {

	
	public static Emp getEmployee(String e) {
		
		if(e.trim().equalsIgnoreCase("AndroidDev")) {
			
			return new AndroidDev();
		}
		else if(e.trim().equalsIgnoreCase("WebDeveloper")) {
			
			return new WebDeveloper();
		}else {
        return null;
	}
	
	}
}

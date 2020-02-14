package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "dsfdsf";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Open Chrome Browser");
		}
		
		else if (browser.equalsIgnoreCase("firefox")) 
		
		{
			System.out.println("Open Firefox Browser");
			
		}
		
		else if (browser.equalsIgnoreCase("ie")) 
		{
			System.out.println("Open IE browser");
			
		}
		
		else
			
		{
			System.out.println("Please provide valid Input");
		}
	}

}

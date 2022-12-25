package welcome;

public class firstLettercapital {
	public static void main(String[] args) {
		System.out.println(capitalize("carrertuner."));     
		System.out.println(capitalize("first letter capital."));          
		System.out.println(capitalize("chracteristic."));    
		System.out.println(capitalize("java is the evergreen language."));   
		}  		
		public static final String capitalize(String str)   
		{  
		if (str == null || str.length() == 0) return str;  
		return str.substring(0, 1).toUpperCase() + str.substring(1);  
		}  
		
	}


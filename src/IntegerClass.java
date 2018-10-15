public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 2;
		Integer b = 3;
		System.out.println(a.compareTo(b));
		// It compares both numbers and it prints what difference is between them.
		
		String str = new String("Xabier Alberdi");
		System.out.println(Integer.getInteger(str, 6));
		System.out.println(Integer.getInteger("abcd",5));
		// It determines the integer value of the system property with the specified name.	
		
		Integer y = 15;
	    int i = y.intValue();
	    System.out.println("Value of i = " + i);
	    // It returns the value as an int.
	      
	    String str2 = new String("123");
	    int num1 = 100;
	    int num2 = Integer.parseInt(str2);
	    int sum = num1 + num2;
	    System.out.println("The value of the sum is:" + sum);
	    // It is used to get the primitive data type of a certain String. 
	      
	      
	    Integer obj = 100;
	    short s = obj.shortValue();
	    System.out.println("Value of s is: " + s);
	    // It returns the value as an int.
	      
	    Integer x = 5;
	    System.out.println(x.toString());  
	    System.out.println(Integer.toString(12)); 
	    // It converts an integer into a string. 
	    
	    String length = "10";
		String width = "12";
		// convert string input into byte
		byte length2 = Byte.valueOf(length);
		byte width2 = Byte.valueOf(width);
		byte area = (byte)(length2 * width2);
		System.out.print(area);
		// It returns a Byte object holding the value represented by the string argument.
	}

}

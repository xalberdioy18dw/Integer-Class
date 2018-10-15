public class IntegerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 2;
		Integer b = 3;
		System.out.println(a.compareTo(b));
		
		String str = new String("Xabier Alberdi");
		System.out.println(Integer.getInteger(str, 6));
		System.out.println(Integer.getInteger("abcd",5));
				
		
		Integer y = 15;
	    int i = y.intValue();
	    System.out.println("Value of i = " + i);
	      
	    String str2 = new String("123");
	    int num1 = 100;
	    int num2 = Integer.parseInt(str2);
	    int sum = num1 + num2;
	    System.out.println("The value of the sum is:" + sum);
	      
	      
	    Integer obj = 100;
	    short s = obj.shortValue();
	    System.out.println("Value of s is: " + s);
	      
	    Integer x = 5;
	    System.out.println(x.toString());  
	    System.out.println(Integer.toString(12)); 
	    
	    String length = "10";
		String width = "12";
		// convert string input into byte
		byte length2 = Byte.valueOf(length);
		byte width2 = Byte.valueOf(width);
		byte area = (byte)(length2 * width2);
		System.out.print(area);
	}

}

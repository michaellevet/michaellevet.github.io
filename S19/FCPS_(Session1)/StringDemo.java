public class StringDemo{

	public static void main(String[] args){
		String x = "Hello";
		String y = "hEllO";
		
		if(x.equals("Hello")){
			System.out.println("x is equal to Hello.");
		}
		
		System.out.println(x + " and " + y + " are equal: " + x.equals(y));
		System.out.println(x + " and " + y + " are equalIgnoreCase: " + x.equalsIgnoreCase(y));
		
		String str = "abcabc";
		System.out.println("First index of ab: " + str.indexOf("ab"));
		System.out.println("Second index of ab: " + str.indexOf("ab", 1));
		System.out.println(str.replace("a", "e"));
		System.out.println(str);
		
		
		str = "    ef gh   ";
		System.out.println(str.trim());
		System.out.println(str);
	}
}
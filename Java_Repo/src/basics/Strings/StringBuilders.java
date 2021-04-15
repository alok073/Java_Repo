package basics.Strings;

public class StringBuilders {

	public static void main(String[] args) {

		//Declaration
		// #1 
		StringBuilder str1 = new StringBuilder();
		// #2 (assigns a character sequence)
		StringBuilder str2 = new StringBuilder("abcd");
		// #3 (creates StringBuilder of specified length)
		StringBuilder str3 = new StringBuilder(20);
		// #4 (creates StringBuilder of specified string)
		String s1 = "hello world";
		StringBuilder str4 = new StringBuilder(s1);
		
		//convert StringBuilder to String
		String s2 = str4.toString();
		
		//append string to StringBuilder
		str4.append("$$");	//hello world$$
		System.out.println(str4.toString()); 
		
		//remove characters from StringBuilder
		str4.delete(11, 13);	//hello world
		System.out.println(str4);
		
		//remove a char from a position
		str4.deleteCharAt(0);	//ello world
		System.out.println(str4);
		
		//insert characters at a position
		str4.insert(0, 'h');	//hello world
		System.out.println(str4);
		str4.insert(11, "!!!"); //hello world!!!
		System.out.println(str4);
		
		//reverse
		str4.reverse();    //!!!dlrow olleh
		System.out.println(str4);
		str4.reverse();	   //hello world!!!
		System.out.println(str4);
		
		//get char at a position
		System.out.println(str4.charAt(0));
		
		//length of StringBuilder
		System.out.println(str4.length());
		
		//get subString
		System.out.println(str4.substring(0,4)); //hell
	}

}

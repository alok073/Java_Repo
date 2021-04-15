package basics.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		/**
		 * String in java is represented as a character array
		 * since arrays cannot change there size dynamically hence strings are immutable
		 * Everytime a change is made in a String, a new string is created internally
		 */
		
		//Declaration
		String s1,s2;
		s1= "hello";
		
		//Accept a string from the user
		Scanner scan = new Scanner(System.in);
		//s1 = scan.next();		//accepts upto 1st space
		s2 = scan.nextLine();	//accepts entire line
		
		//length of a string
		System.out.println(s2.length());
		
		//compare two strings
		System.out.println(s1.compareToIgnoreCase(s2)); // {0 : - : +  ::  equal : s2 is greater : s2 is smaller}
		
		//append two strings
		String s3 = s1.concat(s2);
		s3 = s1 + " " + s2;
		
		//append character to a string
		char c1 = '$';
		s3 = s2 + c1;
		System.out.println(s3);
		
		//convert string to int
		s3 = "12";
		int a = Integer.parseInt(s3);
		
		//convert int to string
		s3 = Integer.toString(a);
		s3 = String.valueOf(a);
		
		//sort a string
		s3 = "hello";
		char[] charArray = s3.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);
		System.out.println(sortedString);
		
		//split a string by a character
		s3 = "hello world";
		String[] stringArray = s3.split(" ");
		
		//join string array into 1 string
		s3 = s3.join("$", stringArray);
		System.out.println(s3);
		
		//to upperCase
		s3 = "hello world";
		s3 = s3.toUpperCase();
		System.out.println(s3);
		
		//to lowerCase
		s3 = s3.toLowerCase();
		System.out.println(s3);
	}

}

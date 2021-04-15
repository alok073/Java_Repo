package basics.dataTypes;

import java.text.DecimalFormat;

public class DataTypes {

	public static void main(String[] args) {
		//Integer data-type (4 bytes, -2,147,483,648 to 2,147,483,647)
		int a = 1;
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		//Short data-type (2 bytes, -32,768 to 32,767)
		short b = 1;
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		//Long data-type (8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		//need to add L after the number to inform the compiler that it is of long dataType
		long c = 9223372036854775807L;
		
		//Byte dataType (1 byte, -128 to 127)
		byte d = 1;
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		//Float data-type (4 byte, upto 7 decimal digits)
		float f1 = 2;
		float f2 = 2.222222f;
		
		//Double data-type (8 byte, upto 15 decimal digits)
		double d1 = 2;
		double d2 = 2.33333d;
		
		/*
		 * print float/double numbers upto certain decimal places
		 * 1. use printf
		 * 2. use DecimalFormat
		 */
		System.out.printf("%.2f", f2); //2.22
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		System.out.println(df.format(f2)); //2.222
		
		//Char data-type (2 byte)
		char c1 = 'a';
		
		//Boolean data-type
		boolean b1 = true;
		
	}		
}



package javaPresentationQn;
import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Write a program which will take a string as input and will convert
		//it into other primitive data type
		
		//String to short
		Scanner str =new Scanner(System.in);
		//String str = "100";
	
		Short val = str.nextShort();
		System.out.println(val);
		
		//String to byte
		String str1 = "100";
		byte val1 = Byte.parseByte(str1);
		System.out.println(val1);
		
		//String to int
		String str2 = "200";
		int i = Integer.parseInt(str2);
		Integer i1 = Integer.valueOf(str2);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(str2+100);//string concatenation
		System.out.println(i+100);//+is binary plus operator
		
		//int to String
		int i2 =10;
		String st1 = String.valueOf(i2);
		System.out.println(st1+100);
		System.out.println(i2+100);
		
		//String to long
		String str3 = "9905707282";
		long l = Long.parseLong(str3);
		System.out.println(l);
		
		//long to string
		long l2 = 234234;
		String st2 = String.valueOf(l2) ;
		System.out.println(st2);
		
		//String to float
		String str4 = "10.00";
		float f = Float.parseFloat(str4);
		System.out.println(f);
		
		//float to String
		float f1= 20.23f;
		String st3 = String.valueOf(f1);
		System.out.println(st3);
		
		//String to char
		
		String str5 = "hello";
		char c = str5.charAt(1);
		System.out.println("first char is: "+c);
		
		//String to boolean
		String s1="true";
		String s2 = "TrUe";
		String s3 = "ok";
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		//String to double
		String str6 = "23456.34";
		Double d1 = Double.parseDouble(str6);
		System.out.println(d1);
		
		//double to string
		double d2 = 234.123;
		String st4 = String.valueOf(d2);
		System.out.println(st4);
		
		//String to date
		//String sdate1 = "07/10/2022";
		//Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
		//System.out.println(sdate1+"\t"+date1);
		
		//binary to decimal
		String binary = "1010";
		int decimal = Integer.parseInt(binary,2);
		System.out.println(decimal);
		
		//decimal to binary
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(21));
		System.out.println(Integer.toBinaryString(31));
		
		//hex to decimal
		System.out.println(Integer.parseInt("a",16));
		System.out.println(Integer.parseInt("f", 16));
		System.out.println(Integer.parseInt("121", 16));
		
		//decimal to hex
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toHexString(15));
		System.out.println(Integer.toHexString(289));
		
		//octal to decimal
		String octal = "121";
		int desimal = Integer.parseInt(octal,8);
		System.out.println(desimal);
		
		//decimal to octal
		System.out.println(Integer.toOctalString(8));
		System.out.println(Integer.toOctalString(19));
		System.out.println(Integer.toOctalString(81));
		
	}


	}


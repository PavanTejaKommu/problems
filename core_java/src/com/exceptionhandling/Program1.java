package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) throws IOException {
		int a = 20;

		int b = 0;
		int result  =0;
		int arr [] = {3};
		String str = null;
		
		
		
		File file = new File(".//new One //resume.txt");
		
		
//		System.out.println(br.read());
//		System.out.println(file.mkdirs());
//		System.out.println(file.mkdir());
		
//		System.out.println(file.exists());
//		System.out.println(file.getAbsoluteFile());
		File file2 = new File("text.txt");
//		System.out.println("Creating File ");
		
/*		System.out.println("Can Read : "+file2.canRead());
		System.out.println("Can Write : "+file2.canWrite());
		
		System.out.println("Absolute path  => "+file2.getAbsolutePath());
	System.out.println( "Exists :  "+	file2.exists());
System.out.println(" Get Name : "+file2.getName());
//*/		System.out.println(file2.createNewFile());
		
//BufferedReader br = new BufferedReader();
		
		FileInputStream fis = new FileInputStream(file2);
//		System.out.println("Available : "+fis.available());
//		System.out.println("To string : "+fis.toString());
		
		FileWriter fw = new  FileWriter(file2);
		fw.write("Hello Pavan Teja");
		
		
		
		FileOutputStream fos = new FileOutputStream(file2);
		
		
		
		
		
		
		
		
		
		
//		System.out.println(file2.toString());
		
		/* try {
			System.out.println(str);
			System.out.println(arr[4]);
			result = a/b;
		} catch (ArithmeticException ae) {
			System.out.println("Arthimatic exception Occured ");
					System.out.println(result);

			System.out.println(ae.toString());
			System.exit(0);
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index Out of Bound Exception Occured");
			System.exit(0);

		}
		catch(NullPointerException np ) {
			System.out.println("Null Pointer Exception Occured ");
			System.exit(0);
		}
		finally {
			System.out.println("Finally Block Executed ");
		}
		*/

	}

}

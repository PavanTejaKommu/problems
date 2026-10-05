package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Program1  {

	public static void main(String[] args) throws IOException {

		File f1 = new File("./new one/text.txt");

		Scanner scd = new Scanner(f1);
		FileReader frd = new FileReader(f1);
		BufferedReader brd = new BufferedReader(frd);
		FileInputStream fis  = new FileInputStream(f1);


		String line;

		while((line = brd.readLine()) != null) {
			System.out.println(line);
		}

scd.close();
frd.close();
brd.close();
fis.close();


	}
}




/* while(scd.hasNext()) {
			String str = scd.nextLine();
			System.out.println(str);
		}
		      /*



		/*  System.out.println(f1.exists()); // result true
		System.out.println(f1.length()); // 0




		 int value ;
		while( (value = fis.read()) != -1) {
			System.out.print((char)value);
		}

		fis.close(); */









/* Write code 
				FileOutputStream fos = new FileOutputStream(f1);
			System.out.println((char) fis.read());
				FileOutputStream fo = new FileOutputStream(f1);
				System.out.println(fis.read());
				System.out.println(fis.read());
				System.out.println(scd.toString());
		System.out.println(scd.getClass());
				File f1 = new File("./new one/text.txt");
				FileInputStream fi  = new FileInputStream(f1);
				FileOutputStream fo = new FileOutputStream(f1);
			System.out.println(" Exists check : "+f1.exists());
						System.out.println("Create file : "+f1.createNewFile());
				System.out.println(" Exists check : "+f1.exists());
				System.out.println("Can Write : "+f1.canWrite());
				System.out.println("Read : "+fi.read());
				System.out.println(" Get File Desc : "+fi.getFD());
				fo.write('f');
				fo.write(3546446);
				System.out.println(fo.toString());
				fi.close();
						fo.close();
 
*/




package org.ycpait.DemofileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("readme.txt");
			System.out.println("File Found:");
			int data = fis.read();
//			System.out.println((char)data);
			
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

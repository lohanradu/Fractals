package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Fractal fractal = new Fractal(0, 0);
		
		try {
			Scanner reader = new Scanner(new File("in.txt"));
			fractal.setLenght(reader.nextInt());
			fractal.setIterations(reader.nextInt());
			reader.close();
		}
		catch (FileNotFoundException error) {
			System.out.println("Nu gasesc in.txt");
		}
		
		System.out.println(fractal.computePerimeter());
	}

}

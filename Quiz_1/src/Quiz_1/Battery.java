package Quiz_1;

import java.util.*;

public class Battery {
	
	Scanner in = new Scanner(System.in);
	
		
		String brand;
		String shape; 
		String size;
		double voltage;
		
	
	public static void setBrand(String brand) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Brand: ");
		this.brand = in.next();
		
	}
	
	public static void setShape(String shape) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Shape: ");
		this.shape = in.next();
	}
	
	public static void setSize(String size) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size: ");
		this.size = in.next();
	}
	
	public static void setVoltage(double voltage) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Voltage: ");
		this.voltage = in.nextDouble();
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public double getVoltage() {
		return this.voltage;
	}

}

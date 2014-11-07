/**
 * 
 * @author Kevin
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cycle {
	public static double numberOfWheels; //initialize values
	public static double weight;
	
	public Cycle(double numberOfWheels, double weight){ //constructor
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString() {
		return "Cycle [numberOfWheels= " + numberOfWheels + ", weight= " + weight + "]"; //to string
	}
	
	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
		Scanner input = null;
		try { //try catch methods
			File file = new File("C:/Users/Kevin/Desktop/Workspace/CycleInput/CycleIn.txt"); //calls txt location
			input = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not found");
			throw e;
		}
		
		while(input.hasNextDouble()) { //set wheel and weight values
			 numberOfWheels=input.nextDouble();
		}
		
		while(input.hasNextDouble()) {
			 weight=input.nextDouble();
		}
		
	 Cycle c = new Cycle(numberOfWheels, weight); //sets new file
	 System.out.println(c.toString());
	}

}

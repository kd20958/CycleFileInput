/**
 * 
 * @author Kevin
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cycle {
	public static double numberOfWheels;
	public static double weight;
	
	public Cycle(double numberOfWheels, double weight){
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString() {
		return "Cycle [numberOfWheels= " + numberOfWheels + ", weight= " + weight + "]";
	}
	
	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
		Scanner input = null;
		try {
			File file = new File("C:/Users/Kevin/Desktop/Workspace/CycleInput/CycleIn.txt");
			input = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not found");
			throw e;
		}
		
		while(input.hasNextDouble()) {
			 numberOfWheels=input.nextDouble();
		}
		
		while(input.hasNextDouble()) {
			 weight=input.nextDouble();
		}
		
	 Cycle c = new Cycle(numberOfWheels, weight);
	 System.out.println(c.toString());
	}

}

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		Automobile [] automobile = new Automobile [3];
		
		automobile [0] = new SportsCar (2016, "Ferrari", "Enzo", "Red", "Speedy", 6, 0.25);
		automobile [1] = new Truck (2010, "Dodge", "Ram", "Grey", "Big Mama", 6);
		automobile [2] = new Minivan (2015, "Toyota", "Prevy", "Green", "Vany", 4);
		
		System.out.println("\nYou created the follow Automobiles:"+automobile[0]+automobile[1]+automobile[2]);
		
		System.out.print("\nEnter the number of dices to determine Operating Cycles: "); 
		int operatingCycle = Dice.Throw(input.nextInt());
		
		System.out.println("Operating Cycles = "+operatingCycle);
		System.out.print("Press 1 to take the Automobiles for a test drive: ");
		int testDrive = input.nextInt();
		
		for (int count=1; count <= operatingCycle; count++)
		{	
			automobile[0].drive (count);
			automobile[1].drive (count);
			automobile[2].drive (count);
			System.out.print(automobile[0]);
			System.out.print(automobile[1]);
			System.out.println(automobile[2]);
		}
	}
}
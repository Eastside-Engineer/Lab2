package Lab2;

import java.util.Scanner;

public class RoomSizeCalculator {

	public static void main(String[] args) {
		 String choice = "y";
		    while (choice.equalsIgnoreCase("y")) {

		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome Grand Circus Room Size Calculator!");
		System.out.println("What room are you measuring?");
		
		String room = input.nextLine();
		
		System.out.println("What is the length of the Room?");
		double length = input.nextDouble();
		
		System.out.println("What is the width of the Room?");
		double width = input.nextDouble();
		
		double perimeter = length += width;
		double area = length * width;
		
		System.out.println("The perimeter of the "+ room + " room is " + perimeter + " inches and the area is " + area + " inches.");
		
		System.out.print("Continue? (y/n): ");
        choice = input.next();
        
        System.out.println("What is the height of the room?");
        
        double height = input.nextDouble();
        
        double volume = height * length * width;
        
        System.out.println("The volume of " + room + " room is " + volume + "!");
        
        System.out.print("Continue? (y/n): ");
        choice = input.next();
        
    }
	
  }

}

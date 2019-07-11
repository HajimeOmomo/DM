import java.util.Scanner;
import java.util.Random;

public class dice {
	public static void main(String arg[]){

	    Scanner scanner = new Scanner(System.in);

	    System.out.println("What your name?");

	    String name = scanner.next();

	    System.out.println("Hello, "+name+"!");

	    

		System.out.println("Rolling the dice...");
		
		
		int total=0;
		for(int i=1;i<=3;i++){
			int j= (int)(Math.random()*6+1);
			System.out.println("Die "+i+": "+j);
			total+=j;
		}
		
		System.out.println("Total value: "+total);

		if(total>10){
		    System.out.println(name + " won!");
		}else{
		    System.out.println(name +" lost!");
		}
		
	}
}

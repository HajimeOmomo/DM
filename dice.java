
import java.util.Random;

public class dice {
	public static void main(String arg[]){

		System.out.println("Rolling the dice...");
		
		
		int total=0;
		for(int i=1;i<=2;i++){
			int j= (int)(Math.random()*6+1);
			System.out.println("Die "+i+": "+j);
			total+=j;
		}
		
		System.out.println("Total value: "+total);
		
	}
}

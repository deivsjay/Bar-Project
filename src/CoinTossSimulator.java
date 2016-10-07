import java.util.Random;
import java.util.Scanner;

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
	
	private int headsHeads;
	private int headsTails;
	private int tailsTails;
	private int trials;


   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
	   
	   headsHeads = 0;
	   headsTails = 0;
	   tailsTails = 0;
	   trials = 0;

   }

   /**
      Runs the simulation for numTrials more trials. Multiple calls to this
      without a reset() between them add these trials to the simulation
      already completed.
      
      @param numTrials  number of trials to for simulation; must be >= 0
    */
   public void run(int numTrials) {
	   
	   Scanner in = new Scanner(System.in);
	   
	   while (numTrials < 0) {
		   System.out.println("Please enter number of trials greater than or equal to 0: ");
		   if(in.hasNextInt()){
			   numTrials = in.nextInt();
		   }
		   else{
			   System.out.println("Error: Not an integer. ");
		   }
	   }
	   
	   trials += numTrials;
	   Random rand = new Random();
	   int num = 0;
	   
	   for (int i = 0; i < numTrials; i++) {
		   num = rand.nextInt(4) + 1;
		   if(num == 1){
			   headsHeads++;
		   }
		   else if (num == 2){
			   tailsTails++;
		   }
		   else{
			   headsTails++;
		   }
	   }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
	   return trials;
	}


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads(){ 
       return headsHeads; 
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return tailsTails; 
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headsTails; 
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   headsHeads = 0;
	   headsTails = 0;
	   tailsTails = 0;
	   trials = 0;
   }

}

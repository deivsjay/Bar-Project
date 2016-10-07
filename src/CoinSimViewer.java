import javax.swing.JFrame;
import java.util.Scanner;

public class CoinSimViewer {
	
	public static void main (String args[]){
		
		JFrame frame = new JFrame();
		
		frame.setSize(800, 500);
		frame.setTitle("CoinSim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CoinTossSimulator coin = new CoinTossSimulator();
		
		coin.run(askUser());
		
		CoinSimComponent component = new CoinSimComponent(coin.getTwoHeads(), coin.getTwoTails(), coin.getHeadTails(), coin.getNumTrials());
		frame.add(component);
		
		frame.setVisible(true);
	}
	
	public static int askUser() {
		
		int numOfTrials = -1;
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many trials would you like to run? ");
		
		while (numOfTrials < 0) {
		   System.out.print("Please enter number of trials greater than or equal to 0: ");
		   if(in.hasNextInt()){
			   numOfTrials = in.nextInt();
		   }
		   else{
			   System.out.println("Error: Not an integer. ");
		   }
		}
		
		return numOfTrials;
	}
	
}

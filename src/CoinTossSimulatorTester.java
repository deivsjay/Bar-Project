
public class CoinTossSimulatorTester {
	
	public static void main (String args[]){
		
		CoinTossSimulator coin = new CoinTossSimulator();
		
		System.out.println("After constructor: ");
		tester(coin);
		
		System.out.println("After run(1):");
		coin.run(1);
		tester(coin);
		
		System.out.println("After run(10):");
		coin.run(10);
		tester(coin);
		
		System.out.println("After run(100):");
		coin.run(100);
		tester(coin);
		
		System.out.println("After run(1000):");
		coin.run(1000);
		tester(coin);
		
		System.out.println("After run(10000):");
		coin.run(10000);
		tester(coin);
		
		System.out.println("After run(100000):");
		coin.run(100000);
		tester(coin);
		
		System.out.println("After run(1000000):");
		coin.run(1000000);
		tester(coin);
		
		System.out.println("After run(10000000):");
		coin.run(10000000);
		tester(coin);
		
		coin.reset();
		
		System.out.println("After reset:");
		tester(coin);
		
		System.out.println("After run(1000): ");
		coin.run(1000);
		tester(coin);
		
		System.out.println("After run(50): ");
		coin.run(100);
		tester(coin);

		System.out.println("After run(200): ");
		coin.run(20);
		tester(coin);
		
		System.out.println("After run(5): ");
		coin.run(5);
		tester(coin);
		
		coin.reset();
		
		System.out.println("After reset and run(10): ");
		coin.run(10);
		tester(coin);
		
		System.out.println("After run(2147483600): ");
		coin.run(2147483600);
		tester(coin);
		
		coin.reset();
		System.out.println("After reset:");
		tester(coin);
		
		System.out.println("After run(2247483647): ");
		coin.run(2147483647);
		tester(coin);
		
		System.out.println("After run(100)");
		coin.run(2147483647);
		tester(coin);
		
		coin.reset();
		System.out.println("After final reset:");
		tester(coin);
		 
	}
	
	public static void tester (CoinTossSimulator coin_method){
		
		boolean tossAddUp = false;
		
		System.out.println("Number of trials: " + coin_method.getNumTrials());
		System.out.println("Two-head tosses: " + coin_method.getTwoHeads());
		System.out.println("Two-tail tosses: " + coin_method.getTwoTails());
		System.out.println("One-head one-tail tosses: " + coin_method.getHeadTails());
		if (coin_method.getTwoHeads() + coin_method.getTwoTails() + coin_method.getHeadTails() == coin_method.getNumTrials()){
			tossAddUp = true;
		}
		else{
			tossAddUp = false;
		}
		System.out.println("Tosses add up correctly? " + tossAddUp + "\n");
	}

}

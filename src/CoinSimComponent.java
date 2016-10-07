import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CoinSimComponent extends JComponent {
	
	private int headsHeads;
	private int tailsTails;
	private int headsTails;
	private int totalNumOfTrials;
	private double headsHeadsPercentage;
	private double tailsTailsPercentage;
	private double headsTailsPercentage;
	//public static final int MAX_HEIGHT_OF_BAR = this.getHeight();
	public static final int WIDTH = 50;
	public static final int BOTTOM_SPACE = 50;
	
	public CoinSimComponent (int headsHeads, int tailsTails, int headsTails, int totalNumOfTrials) {

		this.headsHeads = headsHeads;
		this.tailsTails = tailsTails;
		this.headsTails = headsTails;
		this.totalNumOfTrials = totalNumOfTrials;
		headsHeadsPercentage = Math.round(((double) (headsHeads)/totalNumOfTrials) * 100);
		tailsTailsPercentage = Math.round(((double) (tailsTails)/totalNumOfTrials) * 100);
		headsTailsPercentage = Math.round(((double) (headsTails)/totalNumOfTrials) * 100);
	}
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		Bar results1 = new Bar(getHeight() - BOTTOM_SPACE, (int) (.25 * (getWidth() - 3 * WIDTH)), WIDTH, headsHeads, (double) ((this.getHeight() - 150) / totalNumOfTrials), Color.RED, "Two Heads: " + headsHeads + " (" + (int) headsHeadsPercentage + "%)");
		results1.draw(g2);
		
		Bar results2 = new Bar(getHeight() - BOTTOM_SPACE, (int) (.5 * (getWidth() - 3 * WIDTH) + WIDTH), WIDTH, headsTails, (double) ((this.getHeight() - 150) / totalNumOfTrials), Color.GREEN, "A Head and a Tail: " + headsTails + " (" + (int) headsTailsPercentage + "%)");
		results2.draw(g2);
		
		Bar results3 = new Bar(getHeight() - BOTTOM_SPACE, (int) (.75 * (getWidth() - 3 * WIDTH) + 2 * WIDTH), WIDTH, tailsTails, (double) ((this.getHeight() - 150) / totalNumOfTrials), Color.BLUE, "Two Tails: " + tailsTails + " (" + (int) tailsTailsPercentage + "%)");
		results3.draw(g2);
}

}

package oswego.csc385.a6;

/**
 * A recursive implementation of the Josephus-Problem.
 * @author  B. Tenbergen [bastian.tenbergen@oswego.edu]
 * @version 05.11.2015
 * @since   26.05.2010
 * @see     JosephusCircle
 */
public class Algorithm2 extends JosephusCircle {

	/**
	 * @see JosephusCircle 
	 */
	public Algorithm2(int p, int c, int i) {
		super(p, c, i);
	}
	
	/**
	 * @see JosephusCircle 
	 */
	@Override
	public int algorithm() {
		this.lastManStanding = algorithm(this.soldiers, this.count);
		return this.lastManStanding;	
	}
	
	/**
	 * Necessary for recursive call.
	 * @param numMen Number of soldiers in a circles.
	 * @param count Magic number to which they count.
	 * @return The "safe spot".
	 */
	private int algorithm(int numMen, int count) {
		if (numMen == 1) return 0;
	    else return (algorithm(numMen - 1, count) + count) % numMen;
	}
}

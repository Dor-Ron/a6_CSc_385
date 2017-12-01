package oswego.csc385.a6;

/**
 * Executes the three implementations concurrently.
 * @author  B. Tenbergen [bastian.tenbergen@oswego.edu]
 * @version 05.11.2015
 * @since   26.05.2010
 */
public class Main {

	/**
	 * Starts all three algorithms in an own thread.
	 * @param args n/A
	 */
	public static void main(String[] args) {
		
		java.util.Random r = new java.util.Random();
		int p = r.nextInt(10) + 1;
		int c = r.nextInt(10) + 1;
		int i = r.nextInt(10000) + 1;
		
		System.out.println("Starte Algorithmen-Threads mit: ");
		System.out.println("  p = " + p);
		System.out.println("  c = " + c);
		System.out.println("  i = " + i);
		
		JosephusCircle jc1 = new Algorithm1(p, c, i);
		JosephusCircle jc2 = new Algorithm2(p, c, i);
		JosephusCircle jc3 = new Algorithm3(p, c, i);
		
		Thread a1 = new Thread(jc1);
		Thread a2 = new Thread(jc2);
		Thread a3 = new Thread(jc3);
		
		//Sets the name of the threads... just for convenience in TPTP
		a1.setName("Algorithmus1");
		a2.setName("Algorithmus2");
		a3.setName("Algoritumus3");
		
		a1.run();
		a2.run();
		a3.run();
		
		System.out.println(a1.getName() + " said the Last Man Standing is: " + jc1.lastManStanding);
		System.out.println(a2.getName() + " said the Last Man Standing is: " + jc2.lastManStanding);
		System.out.println(a3.getName() + " said the Last Man Standing is: " + jc3.lastManStanding);
		
		System.out.println("Done.");
	}
}
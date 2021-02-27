/**
 * 
 */
package assignment.ThreadAndJUnit;

/**
 * @author andrewwerling
 *
 */
public class ArtistDeadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicArtist marshmello = new MusicArtist("Marshmello", 100, 1000000);
		MusicArtist skrillex = new MusicArtist("Skrillex", 400, 1000000);
		
		System.out.println("BEGIN");
		
		Runnable firstThread = new Runnable() {

			@Override
			public void run() {
				
				try {
					synchronized (marshmello) {
						Thread.sleep(10);
						synchronized (skrillex) {
							System.out.println("Thread one with Marshmello is running with two locks");
						}
					}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		};
		
		Runnable secondThread = new Runnable() {

			@Override
			public void run() {
				
				try {
					synchronized (skrillex) {
						Thread.sleep(10);
						synchronized (marshmello) {
							System.out.println("Thread two with Skrillex is running with two locks");
						}
					}
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		};
		
		new Thread(firstThread).start();
		new Thread(secondThread).start();
		
		
		System.out.println("END");
		System. exit(0);
	}

}

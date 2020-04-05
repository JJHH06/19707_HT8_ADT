import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author josej
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Would you like to use Java FrameWork implementation?");
		System.out.println("(y/n)");
		
		Scanner scan = new Scanner(System.in);
		QueueFactory<Paciente> factory = new QueueFactory<Paciente>();
		iPriorityQueue<Paciente> hospital = factory.getPriorityQueue(scan.nextLine().toLowerCase());
		
		
		


	}

}

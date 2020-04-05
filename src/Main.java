import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
		QueueFactory<Patient> factory = new QueueFactory<Patient>();
		iPriorityQueue<Patient> hospital = factory.getPriorityQueue(scan.nextLine().toLowerCase());
		
		
		String bar = File.separator;
		String dir = System.getProperty("user.dir");
		File file = new File (dir + bar + "pacientes.txt");
		FileReader fr;
		String line = "";
		try {
		fr = new FileReader (file);
		BufferedReader br = new BufferedReader(fr);
		String[] listLine = null;
		
		while((line = br.readLine()) != null){
		listLine = line.split(", ");
		hospital.add(new Patient(listLine[0],listLine[1],listLine[2]));
		
		}
		}
		catch(Exception e) {
			
		}
		
		String optionMenu = "";
		
		do {
			System.out.println("******PRIORITY HOSPITAL-19707******");
			System.out.println("What would you like to do?");
			System.out.println("\n1. Attend the next patient");
			System.out.println("2. See the patients ordered by priority");
			System.out.println("3. EXIT");
			optionMenu = scan.nextLine();
			
			switch(optionMenu) {
			case "1":
				System.out.println(hospital.remove());
				break;
			case "2":
				System.out.println(hospital.toString());
				break;
			
			}
		}while(!optionMenu.equals("3"));
		
		


	}

}

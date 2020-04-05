import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;

public class PriorityQueueHospital {
	
	private PriorityQueue<Patient> hospital = new PriorityQueue<Patient>();
	
	public PriorityQueueHospital() {
		fillHospital();
	}
	
	
	private void fillHospital() {
		String barra = File.separator;
		String dir = System.getProperty("user.dir");
		File archivo = new File (dir + barra + "datos.txt");
		FileReader fr;
		String linea = "";
		try {
		fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String[] listaLinea = null;
		
		while((linea = br.readLine()) != null){
		listaLinea = linea.split(", ");
		hospital.add(new Patient(listaLinea[0],listaLinea[1],listaLinea[2]));
		
		}
		}
		catch(Exception e) {
			
		}
	}
	
	public String seePatients() {
		
		return hospital.toString();
	}
	
	public String seePriority() {
		return hospital.peek().toString();
	}
	
	public String dispatchPatient() {
		return hospital.poll().toString();
	}
	
	

}

/**
 * @author Jose Hurtarte 19707
 *
 */
public class Patient implements Comparable<Patient>{
	private String name;
	private String description;
	private String priority;
	
	/*
	  I actually developed all the application
	  in English to match the comments xD 
	 */
	
	
/**
 * constructor of patient using fields
 * @param name of the patient
 * @param the symptoms of the patient
 * @param priority of the case
 */
	public Patient(String name, String description, String priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	/**
	 * method that returns the name of the patient
	 * @return Patient name
	 */
	public String getName() {
		return name;
	}

	/**
	 * changes the name of the patient
	 * @param name of patient
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the symptoms of the patient
	 * @return the symptoms of the patient
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets new symptoms of patient
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * gets the priority in which the patient should be attended
	 * @return priority of patient
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets a new priority to the patient
	 * @param priority of patient
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	/**
	 * compares patients by its priority
	 */
	public int compareTo(Patient priority) {
		// TODO Auto-generated method stub
		return this.priority.compareTo(priority.getPriority());
	}

	@Override
	public String toString() {
		return name + ", " + description + ", " + priority;
	}


	
	
	
	

}

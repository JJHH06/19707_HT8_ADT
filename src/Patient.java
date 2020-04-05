/**
 * 
 */

/**
 * @author josej
 *
 */
public class Patient implements Comparable<Patient>{
	private String name;
	private String description;
	private String priority;
	
	/*
	 * I actually developed all the program in English to match the comments xD
	 * 
	 */
	
	

	public Patient(String name, String description, String priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Patient priority) {
		// TODO Auto-generated method stub
		return this.priority.compareTo(priority.getPriority());
	}

	@Override
	public String toString() {
		return name + ", " + description + ", " + priority;
	}


	
	
	
	

}

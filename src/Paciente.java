/**
 * 
 */

/**
 * @author josej
 *
 */
public class Paciente implements Comparable<Paciente>{
	private String nombre;
	private String decripcion;
	private String prioridad;
	
	public Paciente(String nombre, String decripcion, String prioridad) {
		this.nombre = nombre;
		this.decripcion = decripcion;
		this.prioridad = prioridad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public int compareTo(Paciente priority) {
		// TODO Auto-generated method stub
		return this.prioridad.compareTo(priority.getPrioridad());
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", decripcion=" + decripcion + ", prioridad=" + prioridad + "]";
	}


	
	
	
	

}

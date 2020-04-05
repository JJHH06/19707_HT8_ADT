import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Jose Hurtarte
 *
 */
class TestPriorityqueue {

	@Test
	/**
	 * Test of the VectorHeap implementation of the PriorityQueue
	 */
	void testVector() {
		QueueFactory<Patient> factory = new QueueFactory<Patient>();
		iPriorityQueue<Patient> hospitalP = factory.getPriorityQueue("n");
		hospitalP.add(new Patient("Alvaro", "Dolores de parto", "B"));
		hospitalP.add(new Patient("Andrei", "Gripe", "C"));
		hospitalP.add(new Patient("Jimmy", "Infarto", "A"));
		assertEquals("A", hospitalP.getFirst().getPriority());
	}
	
	@Test
	/**
	 * Test of the Framework implementation of the PriorityQueue
	 */
	void testFramework() {
		QueueFactory<Patient> factory = new QueueFactory<Patient>();
		iPriorityQueue<Patient> hospitalP = factory.getPriorityQueue("y");
		hospitalP.add(new Patient("Taracena", "Dolores de parto", "B"));
		hospitalP.add(new Patient("Jeffet", "Gripe", "C"));
		hospitalP.add(new Patient("Jimmy", "Infarto", "A"));
		assertEquals("A", hospitalP.getFirst().getPriority());
	}

}

import java.util.PriorityQueue;

public class FrameworkQueue<E extends Comparable<E>> implements iPriorityQueue<E> {

	private PriorityQueue<E> data;
	
	public FrameworkQueue() {
		data = new PriorityQueue<E>();
	}
	
	
	@Override
	/**
	 * peeks the priorityQueue
	 */
	public E getFirst() {
		return data.peek();
	}

	@Override
	/**
	 * removes the corresponding data in the priorityQueue
	 */
	public E remove() {
		return data.poll();
	}

	@Override
	/**
	 * Adds a node based on the E value
	 */
	public void add(E value) {
		data.add(value);
	}

	@Override
	/**
	 * verifies if the priorityQueue is empty, and if so it returns true
	 */
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	/**
	 * How much objects are stored in the priorityQueue
	 */
	public int size() {
		return data.size();
	}

	@Override
	/**
	 * Resets the priorityQueue
	 */
	public void clear() {
		data.clear();
	}

	@Override
	/**
	 * returns the toString of each object split by line
	 */
	public String toString() {
		String list = "";
		for (E e : data) {
			list += e + "\n";
		}
		return list;
	}
	

}

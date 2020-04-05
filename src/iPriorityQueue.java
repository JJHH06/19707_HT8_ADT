/**
 * @author Duane A Bailey (2005) Java Structures
 *
 */

//the only thing I did here was changing the format of the comments

public interface iPriorityQueue<E extends Comparable<E>>
{
	/**
	 * @pre !isEmpty()
	 * @post returns the minimum value in priority queue
	 */
	public E getFirst();
	
	/**
	 * @pre !isEmpty()
	 * @post returns and removes minimum value from queue
	 */
	public E remove();
	
	/**
	 * @pre value is non-null comparable
	 * @post value is added to priority queue
	 */
	public void add(E value);
	
	/**
	 * @post returns true iff no elements are in queue
	 */
	public boolean isEmpty();
	
	/**
	 * @post returns number of elements within queue
	 */
	public int size();
	
	/**
	 * @post removes all elements from queue
	 */
	public void clear();
	
	

}
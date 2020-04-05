import java.util.Vector;
/**
 * 
 * @author Jose Hurtarte 19707
 * @author Duane A Bailey (2005) Java Structures
 *
 * @param <E> The object that the VectorHeap is going to manage
 */

// I had to implement some methods that the JavaStructures book didn't


/*
 Yeah I'm actually making comments in English, because, in
 order to match the language of the comments, it was easier 
 to comment my methods in this language rather than 
 translating all the book comments into Spanish XD
 
 
 
 * Hope you dont mind XD
 
 * JJHH
 */



public class VectorHeap<E extends Comparable<E>> implements iPriorityQueue<E>
{

	protected Vector<E> data; // the data, kept in heap order

	/**
	 * @post constructs a new priority queue
	 */
	public VectorHeap()
	{
		data = new Vector<E>();
	}

	/**
	 * @post constructs a new priority queue from an unordered vector
	 */
	public VectorHeap(Vector<E> v)
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}
	
	/**
	 * 
	 * @pre 0 <= i < size
	 * @post  returns parent of node at location i
	 */
	protected static int parent(int i)
	{
		return (i-1)/2;
	}

	/**
	 * 
	 * @pre 0 <= i < size
	 * @post returns index of left child of node at location i
	 */
	protected static int left(int i)
	{
		return 2*i+1;
	}

	/**
	 * 
	 * @param 0 <= i < size
	 * @post returns index of right child of node at location i
	 */
	protected static int right(int i) 
	{
		return (2*i+1) + 1;
	}

	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

	@Override
	/**
	 * @pre value is non-null comparable
	 * @post value is added to priority queue
	 * 
	 */
	public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

	/**
	 * 
	 * @pre 0 <= root < size
	 * @post moves node at index root down to appropriate position in subtree
	 */
	protected void pushDownRoot(int root)
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

	@Override
	/**
	 * elimina y retorna el ultimo dato correspondiente en el heap
	 */
	public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

	@Override
	/**
	 * Devuelve el primer elemento del vector
	 */
	public E getFirst() {
		// TODO Auto-generated method stub
		return data.get(0);
	}

	@Override
	/**
	 * devuelve True si el vector esta vacio
	 * 
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return data.size() == 0;
	}

	@Override
	/**
	 * Returns the number of objects in the data vector
	 */
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	/**
	 * Resets the storage vector by creating a new instance of it
	 */
	public void clear() {
		data = new Vector<E>();
	}

	@Override
	public String toString() {
		String list = "";
		for (E e : data) {
			list += e + "\n";
		}
		return list;
	}
	
	
	
	
}
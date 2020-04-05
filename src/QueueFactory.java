/**
 * @author Jose Hurtarte 19707
 * 
 */
class QueueFactory<E extends Comparable<E>> {
  
  /**
   * @param instructions index of the priorityQueue to be used
   * @return an implementation of a priorityQueue
   */
  public iPriorityQueue<E> getPriorityQueue(String instructions) {
    switch (instructions) {
      case "y":
        return new FrameworkQueue<E>();
        
      default:
        return new VectorHeap<E>();
    }
  }
}
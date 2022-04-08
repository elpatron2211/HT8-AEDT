/**
 * PriorityQueue
 * Objetivo: Interfaz de funciones
 * 
 * @author Pedro Marroquin 
 * @author Paulo Sanchez
 * @version 1.0 finalizado 8/02/2022
 */
public interface PriorityQueue<E extends Comparable<E>> {
    /**
     *@return the minimum value in priority queue
     * if the queue isn't empty
     */
    public E getFirst();

    /**
     *@return the minimum value in priority queue removing it as well
     * if the queue isn't empty
     */
    public E remove();

    /**
     * @param value to add to Priority Queue
     *value must be non-null and comparable
     */
    public void add(E value);

    /**
     * @return true if there aren't any values in the Priority Queue
     */
    public boolean isEmpty();

    /**
     * @return amount of values in the Priority Queue
     */
    public int size();

    /**
     * removes all elements from queue
     */
    public void clear();
}

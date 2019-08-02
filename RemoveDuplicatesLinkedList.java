//Remove duplicates from an unsorted linked list.

import java.util.*;

public class RemoveDuplicatesLinkedList {
    
    public static LinkedList removesDups(LinkedList list) {
        // Setting the ListIterator at a specified position (here, 0)
        ListIterator listIter = list.listIterator(0); 
        Hashtable<Object, Integer> table = new Hashtable<>();
  
        // Iterating through the list from the position 0 to fill the created table 
        while (listIter.hasNext()) {
            Object obj = listIter.next();
            if (table.containsKey(obj)) { 
                listIter.remove();
                table.put(obj, table.get(obj) + 1);
            }
            else table.put(obj, 1);
        } 
        //System.out.println(table);
        return list;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scnr = new Scanner(System.in);
        System.out.println();
        System.out.println("Please, inform Linked List elements delimited by space:");
        System.out.println("WARNING: after the integers have been typed, a non-integer value MUST be typed!");
        
        //WARNING: THIS METHOD WORKS ONLY FOR INTEGERS! FOR STRINGS IT HAS BUG
        while (scnr.hasNextInt()) {
            list.add(scnr.nextInt()); 
        }
        LinkedList listReturned = removesDups(list);
        System.out.println(listReturned);

        scnr.close();
    }
}
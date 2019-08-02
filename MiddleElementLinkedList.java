import test.LinkedList.node;
import java.util.*;

/**
 * Java program to find middle element of linked list in one pass.
 */

public class MiddleElementLinkedList {
  
  
        public static void main(String args[]) {
            
            //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        LinkedList.head = linkedList.head();
        linkedList.add( new LinkedList.node("1"));
        linkedList.add( new LinkedList.node("2"));
        linkedList.add( new LinkedList.node("3"));
        linkedList.add( new LinkedList.node("4"));
        
        //finding middle element of LinkedList in single pass
        LinkedList.node current = head;
        int length = 0;
        LinkedList.node middle = head;
        
        
        while (current.next() != null) {
            length++;
            if (length%2 == 0) { //caso o num. de elem. da lista for par
                middle = middle.next(); //eu vou ate ele sem precisar percorrer a lista toda novamente
            }
            current = current.next();
        
            if (length%2 == 1) { //caso o num. de elem. percorridos for impar
                middle = middle.next(); //eu vou ate ele sem precisar percorrer a lista toda novamente
            }
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);
        }  
    }

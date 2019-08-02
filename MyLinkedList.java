

public class MyLinked<E> {
    //Class variables for the linked list
    private Node head; //first element of the list
    private int n; //size of the list

    private static class Node<E> { //Linked list node. Static so main() can access it.
        private Node<E> next;
        private E data;
        
        public Node<E>(E dataValue) { //Node constructor to create a new Node
            this.next = null;  
            this.data = dataValue;
        }
        public E getData() {
			return data;
		} 
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> nextValue) {
			next = nextValue;
		}
    }

    public MyLinked() { //Linked list constructor to create a new linked list
    
    }



}
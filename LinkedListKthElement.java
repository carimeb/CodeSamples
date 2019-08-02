//Implement an algorithm to find the kth to last element of a singly linked list.
//Print the kth element.

import java.util.*;
import java.io.*;

public class LinkedListKthElement {

    public static Object kElem(LinkedList list, int k) {
        int indexOfK;
        if (k == 0 || k == 1) indexOfK = list.size() - 1; //k will be the last element of the list
        else indexOfK = list.size() - k;
        ListIterator iterator = list.listIterator(indexOfK);
        Object obj = iterator.next();
        return obj;
    }
    public static void main(String[] args) throws IOException {
        
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Please, inform linked list String elements. The value of k (integer) must be the last one.");
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        String lines = bR.readLine(); // reason to IOException at signature  
        String[] strs = lines.trim().split("\\s+"); //delimiter is white space

        for (int i = 0; i < strs.length - 1; i++) { //o ultimo elem sera k (nao pertence a lista)
            list.add(strs[i]);
        }
        int k = Integer.parseInt(strs[strs.length - 1]);

        Object kElement = kElem(list, k);
        System.out.println(kElement);
    }
}
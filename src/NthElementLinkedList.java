import java.util.ArrayList;

/**
 * Implement a function that finds the nth node in a linked list, counting from the end
 * Your function should take a linked list (it's head element) and n, a positive integer as it's arguments
 * Example:
 * head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null
 * The third element of head counting from the end is 3
 *
 * If the given n is larger than the number of nodes in the list, return null
 * If the head is null, return null
 */
class NthElementLinkedList {

    static Node find(Node head, int n) {

        if (head == null) {
            return null;
        }

        ArrayList<Node> list = new ArrayList<>();
        Node current = head;
        while (current != null ) {
            list.add(current);
            current = current.child;
        }

        if (n > list.size()) {
            return null;
        }

        return list.get(list.size() - n);

    }

}

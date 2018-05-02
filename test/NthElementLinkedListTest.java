import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthElementLinkedListTest {

    private Node current = null;
    private Node current2 = null;
    private Node head;
    private Node head2;

    @Before
    public void init() {
        for (int i = 1; i < 8 ; i++) {
            current = new Node(i, current);
        }
        head = current;

        for (int i = 4; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        head2 = current2;
    }

    @Test
    public void find() {
        assertEquals(1, NthElementLinkedList.find(head, 1).value);
    }

    @Test
    public void second() {
        assertEquals(5, NthElementLinkedList.find(head, 5).value);
    }

    @Test
    public void third() {
        assertEquals(2, NthElementLinkedList.find(head2, 3).value);
    }

    @Test
    public void fourth() {
        assertEquals(1, NthElementLinkedList.find(head2, 4).value);
    }

    @Test
    public void fifth() {
        assertNull(NthElementLinkedList.find(head2, 5));
    }

    @Test
    public void sixth() {
        assertNull(NthElementLinkedList.find(null, 1));
    }
}
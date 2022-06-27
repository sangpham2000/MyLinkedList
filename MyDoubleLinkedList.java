import java.util.NoSuchElementException;

public class MyDoubleLinkedList extends DoubleNode {
    private DoubleNode head;
    private double numNode;

    public void addFirst(double item) {
        head = new DoubleNode(item, head);
        numNode++;
    }

    public void addLast(double item) {
        if (head == null) {
            addFirst(item);
        } else {
            DoubleNode tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            DoubleNode newNode = new DoubleNode(item, null);
            tmp.setNext(newNode);
            numNode++;
        }
    }

    public void addAfter(DoubleNode curr, double item) {
        if (curr == null) {
            addFirst(item);
        } else {
            DoubleNode newNode = new DoubleNode(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }

    public void print() {
        if (head != null) {
            DoubleNode tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while (tmp != null) {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        } else {
            System.out.println("List is empty!");
        }
    }

    public double removeFirst() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            DoubleNode tmp = head;
            head = head.getNext();
            numNode--;
            return tmp.getData();
        }
    }

    public double removeAfter(DoubleNode curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException("Can't remove element from an empty list");
        } else {
            DoubleNode delNode = curr.getNext();
            if (delNode != null) {
                curr.setNext(delNode.getNext());
                numNode--;
                return delNode.getData();
            } else {
                throw new NoSuchElementException("No next node to remove");
            }
        }
    }

    public double findMax() {
        double tmp = 0.0;
        DoubleNode item = head;
        for (int i = 0; i < numNode; i++) {
            if (item.getData() > tmp) {
                tmp = item.getData();
            }
            item = item.getNext();
        }
        return tmp;
    }
}
